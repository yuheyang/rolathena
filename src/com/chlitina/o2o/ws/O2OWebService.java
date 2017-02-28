package com.chlitina.o2o.ws;
 
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.chlitina.o2o.entity.AccountBalanceDetail;
import com.chlitina.o2o.entity.AccountBalanceQuery;
import com.chlitina.o2o.entity.AccountBalanceTotal;
import com.chlitina.o2o.entity.AreaBonus;
import com.chlitina.o2o.entity.CustMaster;
import com.chlitina.o2o.entity.FranchiseStore;
import com.chlitina.o2o.entity.MaterialMaster;
import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.OrderHeaderMon;
import com.chlitina.o2o.entity.OrderLogistics;
import com.chlitina.o2o.entity.ProductReport;
import com.chlitina.o2o.entity.SOOrder;
import com.chlitina.o2o.entity.SOOrderResult;
import com.chlitina.o2o.entity.StockItem;
import com.chlitina.o2o.entity.StoreBonusDefine;
import com.chlitina.o2o.entity.StoreMonBonus;
import com.chlitina.o2o.entity.StoreMonBonusSec;
import com.chlitina.o2o.entity.StoreRecharge;
import com.chlitina.o2o.entity.StoreRechargeResult;
import com.chlitina.o2o.entity.impl.SOOrderImpl;
import com.chlitina.o2o.entity.impl.SOOrderResultImpl;
 
@WebService
public interface O2OWebService { 
	//金额查询接口
	public String getBalanceByCustNo(String custno);
	
	//订单创建接口
	public SOOrderResult createSOOrder(SOOrder order);
	
	//订单删除接口
	public SOOrderResult removeSOOrder(String orderno);
	
	//订单解冻接口
	public SOOrderResult unfreezeSOOrder(String orderno); 
	  
	//物流信息接口
	public OrderLogistics getOrderLogistics(String orderno);
	
	//库存查询
	public List<StockItem> getStockItem(List<StockItem> stock);
	
	//加盟店首单查
	public FranchiseStore getFranchiseStore(String custno);
	
	//SAP商品主档，获取中间表资料
	public List<MaterialMaster> getMaterialMaster(int rowstart, int rowend);
	
	//SAP加盟店客户主档
	public List<CustMaster> getCustMaster(int rowstart, int rowend);
	
	//加盟店业绩和金额(一)
	public List<StoreMonBonus> getStoreMonBonus(String year, String mon, int rowstart, int rowend);
	
	//加盟店业绩和金额(二)
	public List<StoreMonBonusSec> getStoreMonBonusSec(String period, int rowstart, int rowend);
	
	//O2O谘询师业绩表结构
	public List<StoreBonusDefine> getStoreBonusDefine(String year, String mon, int rowstart, int rowend);
	
	//TO SAP的充值资料
	public StoreRechargeResult saveStoreRecharge2Sap(StoreRecharge recharge);
	
	//SAP 每日SO单资料，中间表资料
	public List<OrderHeader> getOrdersByDay(String cdate, int rowstart, int rowend);
	
	//SAP 每月SO单资料，中间表资料
	public List<OrderHeaderMon> getOrdersByMon(int rowstart, int rowend);
	
	//全国销售业绩报表数据接口，以供crm+读取，以天为单位
	public List<AreaBonus> getAreaBonusByDay(String querydate, int rowstart, int rowend);
	
	////每天定时同步产品销售报表数据，提供数据接口
	public List<ProductReport> getProductReportByDay(String querydate, int rowstart, int rowend);
	
	//用户余额查询
	public List<AccountBalanceTotal> getAccountBalanceTotal(AccountBalanceQuery query);
	
	public List<AccountBalanceDetail> getAccountBalanceDetail(AccountBalanceQuery query);

}