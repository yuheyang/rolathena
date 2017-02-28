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
	//����ѯ�ӿ�
	public String getBalanceByCustNo(String custno);
	
	//���������ӿ�
	public SOOrderResult createSOOrder(SOOrder order);
	
	//����ɾ���ӿ�
	public SOOrderResult removeSOOrder(String orderno);
	
	//�����ⶳ�ӿ�
	public SOOrderResult unfreezeSOOrder(String orderno); 
	  
	//������Ϣ�ӿ�
	public OrderLogistics getOrderLogistics(String orderno);
	
	//����ѯ
	public List<StockItem> getStockItem(List<StockItem> stock);
	
	//���˵��׵���
	public FranchiseStore getFranchiseStore(String custno);
	
	//SAP��Ʒ��������ȡ�м������
	public List<MaterialMaster> getMaterialMaster(int rowstart, int rowend);
	
	//SAP���˵�ͻ�����
	public List<CustMaster> getCustMaster(int rowstart, int rowend);
	
	//���˵�ҵ���ͽ��(һ)
	public List<StoreMonBonus> getStoreMonBonus(String year, String mon, int rowstart, int rowend);
	
	//���˵�ҵ���ͽ��(��)
	public List<StoreMonBonusSec> getStoreMonBonusSec(String period, int rowstart, int rowend);
	
	//O2O��ѯʦҵ����ṹ
	public List<StoreBonusDefine> getStoreBonusDefine(String year, String mon, int rowstart, int rowend);
	
	//TO SAP�ĳ�ֵ����
	public StoreRechargeResult saveStoreRecharge2Sap(StoreRecharge recharge);
	
	//SAP ÿ��SO�����ϣ��м������
	public List<OrderHeader> getOrdersByDay(String cdate, int rowstart, int rowend);
	
	//SAP ÿ��SO�����ϣ��м������
	public List<OrderHeaderMon> getOrdersByMon(int rowstart, int rowend);
	
	//ȫ������ҵ���������ݽӿڣ��Թ�crm+��ȡ������Ϊ��λ
	public List<AreaBonus> getAreaBonusByDay(String querydate, int rowstart, int rowend);
	
	////ÿ�춨ʱͬ����Ʒ���۱������ݣ��ṩ���ݽӿ�
	public List<ProductReport> getProductReportByDay(String querydate, int rowstart, int rowend);
	
	//�û�����ѯ
	public List<AccountBalanceTotal> getAccountBalanceTotal(AccountBalanceQuery query);
	
	public List<AccountBalanceDetail> getAccountBalanceDetail(AccountBalanceQuery query);

}