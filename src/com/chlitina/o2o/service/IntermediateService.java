package com.chlitina.o2o.service;

import java.util.List;

import com.chlitina.o2o.entity.AreaBonus;
import com.chlitina.o2o.entity.CustMaster;
import com.chlitina.o2o.entity.MaterialMaster;
import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.OrderHeaderMon;
import com.chlitina.o2o.entity.ProductReport;
import com.chlitina.o2o.entity.StoreBonusDefine;
import com.chlitina.o2o.entity.StoreMonBonus;
import com.chlitina.o2o.entity.StoreMonBonusSec;


public interface IntermediateService {
	List<MaterialMaster> getMaterialMaster(int rowstart, int rowend);
	
	int getCustMasterCount();
	
	List<CustMaster> getCustMaster(int rowstart, int rowend);
	
	List<StoreMonBonus> getStoreMonBonus(String year, String mon, int rowstart, int rowend);
	
	List<StoreMonBonusSec> getStoreMonBonusSec(String period, int rowstart, int rowend);
	
	List<StoreBonusDefine> getStoreBonusDefine(String year, String mon, int rowstart, int rowend);
	
	List<OrderHeader> getOrdersByDay(String cdate, int rowstart, int rowend);
	
	List<OrderHeaderMon> getOrdersByMon(int rowstart, int rowend);
	
	List<AreaBonus> getAreaBonusByDay(String querydate, int rowstart, int rowend);
	
	List<ProductReport> getProductReportByDay(String querydate, int rowstart, int rowend);
}
