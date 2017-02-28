package com.chlitina.o2o.ws;

import java.lang.reflect.Method;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.apache.log4j.Logger;

import com.chlitina.o2o.entity.AccountBalanceDetail;
import com.chlitina.o2o.entity.AccountBalanceQuery;
import com.chlitina.o2o.entity.AccountBalanceTotal;
import com.chlitina.o2o.entity.AreaBonus;
import com.chlitina.o2o.entity.Balance;
import com.chlitina.o2o.entity.BalanceRecorder;
import com.chlitina.o2o.entity.CustMaster;
import com.chlitina.o2o.entity.FranchiseStore;
import com.chlitina.o2o.entity.MaterialMaster;
import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.OrderHeaderMon;
import com.chlitina.o2o.entity.OrderLogistics;
import com.chlitina.o2o.entity.ProductReport;
import com.chlitina.o2o.entity.SOOrder;
import com.chlitina.o2o.entity.SOOrderDetail;
import com.chlitina.o2o.entity.SOOrderDetailPromotion;
import com.chlitina.o2o.entity.SOOrderResult;
import com.chlitina.o2o.entity.StockItem;
import com.chlitina.o2o.entity.StoreBonusDefine;
import com.chlitina.o2o.entity.StoreMonBonus;
import com.chlitina.o2o.entity.StoreMonBonusSec;
import com.chlitina.o2o.entity.StoreRecharge;
import com.chlitina.o2o.entity.StoreRechargeResult;
import com.chlitina.o2o.entity.impl.AccountBalanceDetailImpl;
import com.chlitina.o2o.entity.impl.AccountBalanceTotalImpl;
import com.chlitina.o2o.entity.impl.BalanceRecorderImpl;
import com.chlitina.o2o.entity.impl.FranchiseStoreImpl;
import com.chlitina.o2o.entity.impl.OrderLogisticsImpl;
import com.chlitina.o2o.entity.impl.SOOrderDetailPromotionImpl;
import com.chlitina.o2o.entity.impl.SOOrderImpl;
import com.chlitina.o2o.entity.impl.SOOrderResultImpl;
import com.chlitina.o2o.entity.impl.StockItemImpl;
import com.chlitina.o2o.entity.impl.StoreRechargeResultImpl;
import com.chlitina.o2o.sap.rfc.ConnectSAPServer;
import com.chlitina.o2o.service.IntermediateService;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import com.sap.conn.jco.JCoTable;

@WebService(endpointInterface = "com.chlitina.o2o.ws.O2OWebService",serviceName="O2OWebService")  
public class BalanceService implements O2OWebService {
	@Resource(name = "O2OIntermediateService")   
	private IntermediateService intermediateService;
	
	private static Logger logger = Logger.getLogger(BalanceService.class);  
	
	/**
	 * 根据客户编号获取奖金金额
	 * @see com.chlitina.o2o.ws.O2OWebService#getBalanceByCustNo(java.lang.String)
	 */
	@Override
	public String getBalanceByCustNo(@WebParam(name = "custno") String custno){
		System.out.println("custno is "+custno);
		String credit = "";
		ConnectSAPServer server = new ConnectSAPServer();
		JCoDestination jd = server.Connect();
		try {
			jd.ping();
			
			JCoFunction function = jd.getRepository().getFunction("ZSDF03_CUST_CREDIT_BALANCE");
			
			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("CUST_NO", custno);
			
			function.execute(jd);
			
			JCoParameterList parameOut = function.getExportParameterList(); 
			credit = parameOut.getString("CREDIT_LIMIT");
			System.out.println("credit is "+credit);
		} catch (JCoException e) {
			e.printStackTrace();
		}
		return credit;
	}

	/**
	 * 订单生成接口，并根据明细返回促销信息
	 * @see com.chlitina.o2o.ws.O2OWebService#createSOOrder(com.chlitina.o2o.entity.impl.SOOrderImpl)
	 */
	@Override
	public SOOrderResult createSOOrder(SOOrder order){
		SOOrderResult result = new SOOrderResultImpl();
		ConnectSAPServer server = new ConnectSAPServer();
		JCoDestination jd = server.Connect();
		try {
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("ZSDR_SO_CREATE_4SHOP");
			JCoParameterList importParam = function.getImportParameterList();
			Date now = new Date();
			
			Format format = new SimpleDateFormat("yyyyMM");
			Calendar cal = Calendar.getInstance();
			cal.setTime(now);
			if(cal.get(Calendar.DAY_OF_MONTH) >= 27){
				cal.add(Calendar.DAY_OF_MONTH, 10);
			}
			importParam.setValue("YEAR_MONTH", format.format(cal.getTime()));	
			importParam.setValue("CITY", order.getCITY());	
			importParam.setValue("STREET", order.getSTREET());
			
			JCoStructure jsOrder = function.getImportParameterList().getStructure("SO_HEADER_DATA_Z102");
			jsOrder.setValue("VKORG", order.getVKORG());
			jsOrder.setValue("VTWEG", order.getVTWEG());
			jsOrder.setValue("SOLD_TO", order.getSOLD_TO());
			jsOrder.setValue("SHIP_TO", order.getSHIP_TO());
			jsOrder.setValue("BSTKD", order.getBSTKD());
			jsOrder.setValue("REMARK", order.getREMARK());
			jsOrder.setValue("VKBUR", order.getVKBUR());

			JCoTable jsDetail = function.getTableParameterList().getTable("SO_ITEM_DATA_Z102");
			if(order.getDetailList() != null){
				for (SOOrderDetail detail : order.getDetailList()) {
					jsDetail.appendRow();
					jsDetail.setValue("POSNR", detail.getPOSNR());
					jsDetail.setValue("MATNR", detail.getMATNR());
					jsDetail.setValue("SO_QTY", detail.getSO_QTY());
					jsDetail.setValue("SO_UNIT", detail.getSO_UNIT());
					jsDetail.setValue("WERKS", detail.getWERKS());
					jsDetail.setValue("LGORT", detail.getLGORT());
					jsDetail.setValue("VSTEL", detail.getVSTEL());
				}
			}else {
				result.setSTATUS("E");
				result.setMESSAGE("订单明细为空！");
				return result;
			}
			
			
			function.execute(jd);

			JCoParameterList parameOut = function.getExportParameterList();
			String SO_NUMBER = parameOut.getString("SO_NUMBER");
			String STATUS = parameOut.getString("STATUS");
			String MESSAGE = parameOut.getString("MESSAGE");
			result.setSO_NUMBER(SO_NUMBER);
			result.setSTATUS(STATUS);
			result.setMESSAGE(MESSAGE);
			
			JCoTable returnTbl = function.getTableParameterList().getTable("RETURN_TBL");
			List<SOOrderDetailPromotion> promotionList = new ArrayList<SOOrderDetailPromotion>(); 
			for(int i = 0; i < returnTbl.getNumRows(); i++, returnTbl.nextRow()){
				SOOrderDetailPromotion pro = new SOOrderDetailPromotionImpl();
				pro.setMATNR(returnTbl.getString("MATNR"));
				pro.setARKTX(returnTbl.getString("ARKTX"));
				pro.setKWMENG(returnTbl.getString("KWMENG"));
				pro.setZZAFAMT(returnTbl.getString("ZZAFAMT"));
				pro.setZZBVVALUE(returnTbl.getString("ZZBVVALUE"));
				pro.setISPRESENT(returnTbl.getString("ISPRESENT"));
				pro.setERDAT(returnTbl.getString("ERDAT"));
				pro.setVRKME(returnTbl.getString("VRKME"));
				promotionList.add(pro);
			}
			result.setList(promotionList);

		} catch (JCoException e) {
			result.setSTATUS("E");
			result.setMESSAGE(e.toString());
			return result;
		}
		return result;
	}
	
	/**
	 * 订单删除接口
	 */
	@Override
	public SOOrderResult removeSOOrder(String orderNo){
		SOOrderResult result = new SOOrderResultImpl();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("ZSD_DELETE_SO4SHOP");
			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("VBELN", orderNo);	
			
			function.execute(jd);

			JCoParameterList parameOut = function.getExportParameterList();
			String STATUS = parameOut.getString("STATUS");
			String MESSAGE = parameOut.getString("MESSAGE");
			result.setSTATUS(STATUS);
			result.setMESSAGE(MESSAGE);
		} catch (JCoException e) {
			result.setSTATUS("E");
			result.setMESSAGE(e.toString());
			return result;
		}
		return result;
	}
	
	/**
	 * 订单解冻接口
	 */
	@Override
	public SOOrderResult unfreezeSOOrder(String orderNo){
		SOOrderResult result = new SOOrderResultImpl();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("ZSD_UNFREEZE_SO4SHOP");
			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("VBELN", orderNo);	
			
			function.execute(jd);

			JCoParameterList parameOut = function.getExportParameterList();
			String STATUS = parameOut.getString("STATUS");
			String MESSAGE = parameOut.getString("MESSAGE");
			result.setSTATUS(STATUS);
			result.setMESSAGE(MESSAGE);
		} catch (JCoException e) {
			result.setSTATUS("E");
			result.setMESSAGE(e.toString());
			return result;
		}
		return result;
	}
	
	/**
	 * 获取物流信息接口
	 */
	@Override
	public OrderLogistics getOrderLogistics(String orderno){
		OrderLogistics logistics = new OrderLogisticsImpl();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("ZSD_GET_LOGISTICSNO4SHOP");
			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("GT_VBELN", orderno);	
			
			function.execute(jd);

			JCoParameterList parameOut = function.getExportParameterList();
			String STATUS = parameOut.getString("STATUS");
			String MESSAGE = parameOut.getString("MESSAGE");
			String YUNDA = parameOut.getString("YUNDA");
			String LIFNR = parameOut.getString("LIFNR");
			logistics.setSTATUS(STATUS);
			logistics.setMESSAGE(MESSAGE);
			logistics.setYUNDA(YUNDA);
			logistics.setLIFNR(LIFNR);
		} catch (JCoException e) {
			logistics.setSTATUS("E");
			logistics.setMESSAGE(e.toString());
			return logistics;
		}
		return logistics;
	}
	
	/**
	 * 获取库存接口
	 */
	@Override
	public List<StockItem> getStockItem(List<StockItem> stocklist){
		List<StockItem> itemList = new ArrayList<StockItem>();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("ZSDR_RFC_ATPCHECK4SHOP");
			JCoParameterList importParam = function.getImportParameterList();
			
			JCoTable jsDetail = function.getTableParameterList().getTable("FT_SOITEM");
			if(stocklist != null){
				for (StockItem item : stocklist) {
					jsDetail.appendRow();
					jsDetail.setValue("PLANT", item.getPLANT());
					jsDetail.setValue("LOCATION", item.getLOCATION());
					jsDetail.setValue("MATERIAL", item.getMATERIAL());
					jsDetail.setValue("UNIT", item.getUNIT());
					jsDetail.setValue("REQ_QTY", item.getREQ_QTY());
				}
			}
			
			function.execute(jd);
			
			JCoTable returnTbl = function.getTableParameterList().getTable("FT_RETURN");
			for(int i = 0; i < returnTbl.getNumRows(); i++, returnTbl.nextRow()){
				StockItem pro = new StockItemImpl();
				pro.setPLANT(returnTbl.getString("PLANT"));
				pro.setLOCATION(returnTbl.getString("LOCATION"));
				pro.setMATERIAL(returnTbl.getString("MATERIAL"));
				pro.setRET_STATUS(returnTbl.getString("RET_STATUS"));
				pro.setINCOM_QTY(returnTbl.getString("INCOM_QTY"));
				itemList.add(pro);
			}

		} catch (JCoException e) {
			e.printStackTrace();
		}
		return itemList;
	}
	
	/**
	 * 加盟店首购查询
	 */
	@Override
	public FranchiseStore getFranchiseStore(String custno){
		FranchiseStore store = new FranchiseStoreImpl();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("ZSD_GETKUNNERINFO_4SHOP");
			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("KUNNR", custno);	

			function.execute(jd);

			JCoParameterList parameOut = function.getExportParameterList();
			String STATUS = parameOut.getString("STATUS");
			String MESSAGE = parameOut.getString("MESSAGE");
			String BFLAG = parameOut.getString("BFLAG");
			store.setSTATUS(STATUS);
			store.setMESSAGE(MESSAGE);
			store.setBFLAG(BFLAG);
		} catch (JCoException e) {
			store.setSTATUS("E");
			store.setMESSAGE(e.toString());
			return store;
		}
		return store;
	}
	
	/**
	 * SAP商品主档，get 中间表资料
	 * @throws Exception 
	 */
	@Override
	public List<MaterialMaster> getMaterialMaster(int rowstart, int rowend) {
		List<MaterialMaster> masterList = intermediateService.getMaterialMaster(rowstart, rowend);
		return masterList;
	}
	
	/**
	 * SAP加盟店客户主档
	 */
	@Override
	public List<CustMaster> getCustMaster(int rowstart, int rowend){
		List<CustMaster> custList = intermediateService.getCustMaster(rowstart, rowend);
		return custList;
	}
	
	/**
	 * 加盟店业绩和金额(一)
	 */
	@Override
	public List<StoreMonBonus> getStoreMonBonus(String year, String mon, int rowstart, int rowend){
		List<StoreMonBonus> bonusList = intermediateService.getStoreMonBonus(year, mon, rowstart, rowend);
		return bonusList;
	}
	
	/**
	 * 加盟店业绩和金额(二), 参数格式为年月(yyyymm),需改为“yyyy年mm月”
	 */
	@Override
	public List<StoreMonBonusSec> getStoreMonBonusSec(String period, int rowstart, int rowend){
		List<StoreMonBonusSec> bonusList = new ArrayList<StoreMonBonusSec>();
		//Format format = new SimpleDateFormat("yyyyMM");
		try {
			//Date date = (Date)format.parseObject(period);
			//Format format2 = new SimpleDateFormat("yyyy年MM月");
			//bonusList = intermediateService.getStoreMonBonusSec(format2.format(date), rowstart, rowend);
			bonusList = intermediateService.getStoreMonBonusSec(period, rowstart, rowend);
		} catch (Exception e) {
			e.printStackTrace();
			return bonusList;
		}
		return bonusList;
	}
	
	/**
	 * O2O谘询师业绩表结构 中间表的table name：T_O2O_BONUS_DEFINE 店务调用时传入的参数：年(yyyy)、月(mm)
	 */
	@Override
	public List<StoreBonusDefine> getStoreBonusDefine(String year, String mon, int rowstart, int rowend){
		List<StoreBonusDefine> defineList = intermediateService.getStoreBonusDefine(year, mon, rowstart, rowend);
		return defineList;
	}
	
	/**
	 * TO SAP的充值资料
	 */
	@Override
	public StoreRechargeResult saveStoreRecharge2Sap(StoreRecharge recharge){
		StoreRechargeResult result = new StoreRechargeResultImpl();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			System.out.println("saveStoreRecharge2Sap connect");
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("Z_FI_4SHOP");
			
			JCoTable jsDetail = function.getTableParameterList().getTable("IT_DATA");
			if(recharge != null){
				System.out.println("saveStoreRecharge2Sap func is not null");
				jsDetail.appendRow();
				jsDetail.setValue("IBXNO", recharge.getIBXNO());
				jsDetail.setValue("BUKRS", recharge.getBUKRS());
				jsDetail.setValue("UNAME", recharge.getUNAME());
				jsDetail.setValue("ERDAT", recharge.getERDAT());
				jsDetail.setValue("BUDAT", recharge.getBUDAT());
				jsDetail.setValue("RCCOD", recharge.getRCCOD());
				jsDetail.setValue("KUNNR", recharge.getKUNNR());
				jsDetail.setValue("WAERS", recharge.getWAERS());
				jsDetail.setValue("WRBTR", recharge.getWRBTR());
				jsDetail.setValue("REDOC", recharge.getREDOC());
				jsDetail.setValue("TRSTP", recharge.getTRSTP());
				jsDetail.setValue("YAJIN", recharge.getYAJIN());
				jsDetail.setValue("ZLSCH", recharge.getZLSCH());
				jsDetail.setValue("HKONT", recharge.getHKONT());
				jsDetail.setValue("DREMAK", recharge.getDREMAK());
			}else{
				return result;
			}
			
			function.execute(jd);
			System.out.println("saveStoreRecharge2Sap func execute");
			JCoTable returnTbl = function.getTableParameterList().getTable("IT_REST");
			result.setIBXNO(returnTbl.getString("IBXNO"));
			result.setTYPE(returnTbl.getString("TYPE"));
			result.setBELNR(returnTbl.getString("BELNR"));
			result.setBUKRS(returnTbl.getString("BUKRS"));
			result.setERRMSG(returnTbl.getString("ERRMSG"));
			result.setGJAHR(returnTbl.getString("GJAHR"));
			System.out.println("saveStoreRecharge2Sap func over !");
		} catch (Exception e) {
			e.printStackTrace();
			result.setERRMSG(e.toString());
		}
		return result;
	}
	
	//SAP 每日SO单资料，中间表资料
	@Override
	public List<OrderHeader> getOrdersByDay(String cdate, int rowstart, int rowend){
		List<OrderHeader> orderList = intermediateService.getOrdersByDay(cdate, rowstart, rowend);
		return orderList;
	}
		
	//SAP 每月SO单资料，中间表资料
	@Override
	public List<OrderHeaderMon> getOrdersByMon(int rowstart, int rowend){
		List<OrderHeaderMon> orderList = intermediateService.getOrdersByMon(rowstart, rowend);
		return orderList;
	}
	
	//按天为单位，定时地区销售报表数据导入crm+数据库
	@Override
	public List<AreaBonus> getAreaBonusByDay(String querydate, int rowstart, int rowend){
		logger.debug("querydate="+querydate+";rowstart="+rowstart+";rowend="+rowend);
		List<AreaBonus> bonusList = intermediateService.getAreaBonusByDay(querydate, rowstart, rowend);
		logger.debug("arealist size ="+bonusList.size());
		return bonusList;
	}
	
	//每天定时同步产品销售报表数据，提供数据接口
	@Override
	public List<ProductReport> getProductReportByDay(String querydate, int rowstart, int rowend){
		logger.debug("querydate="+querydate+";rowstart="+rowstart+";rowend="+rowend);
		List<ProductReport> report = intermediateService.getProductReportByDay(querydate, rowstart, rowend);
		logger.debug("ProductReport size ="+report.size());
		return report;
	}
	
	// 用户余额查询
	@Override
	public List<AccountBalanceDetail> getAccountBalanceDetail(
			AccountBalanceQuery query) {
		List<AccountBalanceDetail> detailList = new ArrayList<AccountBalanceDetail>();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			System.out.println("getAccountBalance connect");
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("Z_CASH_AMOUNT_TO_CRM");
			System.out.println("Z_CASH_AMOUNT_TO_CRM connect");
			JCoParameterList importParam = function.getImportParameterList();
			if (query != null) {
				importParam.setValue("IM_KKBER", query.getCredit());
				importParam.setValue("IM_BZIRK_F", query.getBzirkstart());
				importParam.setValue("IM_BZIRK_T", query.getBzirkend());
				importParam.setValue("IM_KUNNR_F", query.getKunnrstart());
				importParam.setValue("IM_KUNNR_T", query.getKunnrend());
				importParam.setValue("IM_DATE_F", query.getDetailstart());
				importParam.setValue("IM_DATE_T", query.getDetailend());
				importParam.setValue("IM_RA1", 'X');
				if (query.getSubtotal() != null) importParam.setValue("IM_SUBTOT", 'X');

			}
			System.out.println("getAccountBalance func start" + query.getCredit() + ";" + query.getQuerytype() + ";"
					+ query.getKunnrstart());
			function.execute(jd);
			System.out.println("getAccountBalance func execute");

			JCoTable detailTbl = function.getTableParameterList().getTable("IT_DETAIL");
			for (int i = 0; i < detailTbl.getNumRows(); i++, detailTbl.nextRow()) {
				AccountBalanceDetail detail = new AccountBalanceDetailImpl();
				detail.setBEZEI(detailTbl.getString("BEZEI"));
				detail.setBUDAT(detailTbl.getString("BUDAT"));
				detail.setDOCNO(detailTbl.getString("DOCNO"));
				detail.setIOAMT(detailTbl.getString("IOAMT"));
				detail.setKKBER(detailTbl.getString("KKBER"));
				detail.setKUNNR(detailTbl.getString("KUNNR"));
				detail.setNAME1(detailTbl.getString("NAME1"));
				detail.setNAME2(detailTbl.getString("NAME2"));
				detail.setOBLIG(detailTbl.getString("OBLIG"));
				detail.setORAMT(detailTbl.getString("ORAMT"));
				detail.setREMARK(detailTbl.getString("REMARK"));
				detail.setSAUFT(detailTbl.getString("SAUFT"));
				detail.setSERNO(detailTbl.getString("SERNO"));
				detail.setSKFOR(detailTbl.getString("SKFOR"));
				detail.setSOURCE(detailTbl.getString("SOURCE"));
				detail.setSSOBL(detailTbl.getString("SSOBL"));
				detail.setTIME(detailTbl.getString("TIME"));
				detail.setTOTAL(detailTbl.getString("TOTAL"));
				detail.setUNAME(detailTbl.getString("UNAME"));
				detail.setVKBUR(detailTbl.getString("VKBUR"));
				detail.setWAERS(detailTbl.getString("WAERS"));
				detail.setTYPE(detailTbl.getString("TYPE"));
				detailList.add(detail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detailList;
	}
	
	@Override
	public List<AccountBalanceTotal> getAccountBalanceTotal(AccountBalanceQuery query) {
		List<AccountBalanceTotal> totalList = new ArrayList<AccountBalanceTotal>();
		ConnectSAPServer server = new ConnectSAPServer();
		try {
			JCoDestination jd = server.Connect();
			System.out.println("getAccountBalanceTotal connect");
			jd.ping();
			JCoFunction function = jd.getRepository().getFunction("Z_CASH_AMOUNT_TO_CRM");
			System.out.println("Z_CASH_AMOUNT_TO_CRM connect");
			JCoParameterList importParam = function.getImportParameterList();
			if (query != null) {
				importParam.setValue("IM_KKBER", query.getCredit());
				importParam.setValue("IM_BZIRK_F", query.getBzirkstart());
				importParam.setValue("IM_BZIRK_T", query.getBzirkend());
				importParam.setValue("IM_KUNNR_F", query.getKunnrstart());
				importParam.setValue("IM_KUNNR_T", query.getKunnrend());
				importParam.setValue("IM_RA2", "X");
				if (query.getSubtotal() != null) importParam.setValue("IM_SUBTOT", 'X');
				importParam.setValue("IM_DATE", query.getTotaldate());
			} else {
				return null;
			}
			System.out.println("getAccountBalanceTotal func start" + query.getCredit() + ";" + query.getQuerytype() + ";"
					+ query.getKunnrstart());
			function.execute(jd);
			System.out.println("getAccountBalanceTotal func execute");
			JCoTable sumTbl = function.getTableParameterList().getTable("IT_SUM");
			JCoTable displayTbl = function.getTableParameterList().getTable("IT_DISPLAY");

			Map<String, String> displayMap = new HashMap<String, String>();
			for (int i = 0; i < displayTbl.getNumRows(); i++, displayTbl.nextRow()) {
				System.out.println("displayTbl content "+displayTbl.getString("ID")+";"+displayTbl.getString("DES"));
				displayMap.put(displayTbl.getString("ID"), displayTbl.getString("DES"));
			}
			Set<String> idSet = displayMap.keySet();
			for (int i = 0; i < sumTbl.getNumRows(); i++, sumTbl.nextRow()) {
				AccountBalanceTotal total = new AccountBalanceTotalImpl();
				List<BalanceRecorder> balanceList = new ArrayList<BalanceRecorder>();
				Map<String, String> map = new HashMap<String, String>();
				Iterator<String> ite = idSet.iterator();
				while (ite.hasNext()) {
					String key = (String) ite.next();
					BalanceRecorder rec = new BalanceRecorderImpl();
					rec.setID(key);
					rec.setDES(displayMap.get(key));
					rec.setDMBTR(sumTbl.getString(key));
					map.put(key, sumTbl.getString(key));
					System.out.println("sumTbl content "+key+";"+sumTbl.getString(key)+";"+sumTbl.getString(key));
					balanceList.add(rec);
				}
				System.out.println("balanceList size "+balanceList.size());
				total.setKKBER(sumTbl.getString("KKBER"));
				total.setKUNNR(sumTbl.getString("KUNNR"));
				total.setSERNO(sumTbl.getString("SERNO"));
				total.setORT01(sumTbl.getString("ORT01"));
				total.setNAME1(sumTbl.getString("NAME1"));
				total.setNAME2(sumTbl.getString("NAME2"));
				total.setOBLIG(sumTbl.getString("OBLIG"));
				total.setRecorderList(balanceList);
				total.setDMBTRList(map);
				total.setWAERS(sumTbl.getString("WAERS"));
				System.out.println("getRecorderList size "+balanceList.size());
				totalList.add(total);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalList;
	}
}
