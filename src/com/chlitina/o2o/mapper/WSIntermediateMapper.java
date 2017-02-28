package com.chlitina.o2o.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chlitina.o2o.entity.AreaBonus;
import com.chlitina.o2o.entity.CustMaster;
import com.chlitina.o2o.entity.MaterialMaster;
import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.OrderHeaderMon;
import com.chlitina.o2o.entity.OrderItem;
import com.chlitina.o2o.entity.ProductReport;
import com.chlitina.o2o.entity.StoreBonusDefine;
import com.chlitina.o2o.entity.StoreMonBonus;
import com.chlitina.o2o.entity.StoreMonBonusSec;

@Repository(value = "IntermediateMapper")
@Transactional 
public interface WSIntermediateMapper {
	public List<MaterialMaster> getMaterialMaster(Map<String, Integer> map);
	
	public int getMaterialMasterCount();
	
	public List<CustMaster> getCustMaster(Map<String, Integer> map);
	
	public List<StoreMonBonus> getStoreMonBonus(Map<String, Object> map);
	
	public List<StoreMonBonusSec> getStoreMonBonusSec(Map<String, Object> map);
	
	public List<StoreBonusDefine> getStoreBonusDefine(Map<String, Object> map);
	
	public List<OrderHeader> getOrderHeadersByDay(Map<String, Object> map);
	
	public List<OrderItem> getOrderItemsByIdStr(String headerIdStr);
	
	public List<OrderHeader> getOrdersByDay(Map<String, Object> map);
	
	public List<OrderHeaderMon> getOrdersByMon(Map<String, Object> map);
	
	public List<AreaBonus> getAreaBonusByDay(Map<String, Object> map);
	
	public List<ProductReport> getProductReportByDay(Map<String, Object> map);
}