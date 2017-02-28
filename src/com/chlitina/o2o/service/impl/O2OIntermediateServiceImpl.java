package com.chlitina.o2o.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chlitina.o2o.entity.AreaBonus;
import com.chlitina.o2o.entity.CustMaster;
import com.chlitina.o2o.entity.MaterialMaster;
import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.OrderHeaderMon;
import com.chlitina.o2o.entity.ProductReport;
import com.chlitina.o2o.entity.StoreBonusDefine;
import com.chlitina.o2o.entity.StoreMonBonus;
import com.chlitina.o2o.entity.StoreMonBonusSec;
import com.chlitina.o2o.mapper.WSIntermediateMapper;
import com.chlitina.o2o.service.IntermediateService;
import com.chlitina.o2o.ws.BalanceService;

@Repository(value = "O2OIntermediateService")  
@Transactional
public class O2OIntermediateServiceImpl implements IntermediateService{
	private static Logger logger = Logger.getLogger(O2OIntermediateServiceImpl.class);  

	@Resource(name = "IntermediateMapper")  
	private WSIntermediateMapper mapper;
	
	@Override
	public List<MaterialMaster> getMaterialMaster(int rowstart, int rowend) {
		Map<String, Integer> paraMap = new HashMap<String, Integer>();
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<MaterialMaster> masterList = mapper.getMaterialMaster(paraMap);
		return masterList;
	}

	@Override
	public int getCustMasterCount() {
		int count = mapper.getMaterialMasterCount();
		return count;
	}
	
	@Override
	public List<CustMaster> getCustMaster(int rowstart, int rowend){
		Map<String, Integer> paraMap = new HashMap<String, Integer>();
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<CustMaster> custList = mapper.getCustMaster(paraMap);
		return custList;
	}
	
	@Override
	public List<StoreMonBonus> getStoreMonBonus(String year, String mon, int rowstart, int rowend){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("year", year);
		paraMap.put("mon", mon);
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<StoreMonBonus> bonusList = mapper.getStoreMonBonus(paraMap);
		return bonusList;
	}
	
	@Override
	public List<StoreMonBonusSec> getStoreMonBonusSec(String period, int rowstart, int rowend){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("period", period);
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<StoreMonBonusSec> bonusList = mapper.getStoreMonBonusSec(paraMap);
		return bonusList;
	}
	
	@Override
	public List<StoreBonusDefine> getStoreBonusDefine(String year, String mon, int rowstart, int rowend){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("year", year);
		paraMap.put("mon", mon);
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<StoreBonusDefine> defineList = mapper.getStoreBonusDefine(paraMap);
		return defineList;
	}
	
	@Override
	public List<OrderHeader> getOrdersByDay(String cdate, int rowstart, int rowend){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("cdate", cdate);
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<OrderHeader> orderList = mapper.getOrdersByDay(paraMap);
		return orderList;
	}

	@Override
	public List<OrderHeaderMon> getOrdersByMon(int rowstart, int rowend){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		List<OrderHeaderMon> orderList = mapper.getOrdersByMon(paraMap);
		return orderList;
	}
	
	@Override
	public List<AreaBonus> getAreaBonusByDay(String querydate, int rowstart, int rowend){
		logger.debug("querydate="+querydate+";rowstart="+rowstart+";rowend="+rowend);
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("querydate", querydate);
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		logger.debug("AreaBonus search begin");
		List<AreaBonus> areaBonusList = mapper.getAreaBonusByDay(paraMap);
		logger.debug("arealist size ="+areaBonusList.size());
		return areaBonusList;
	}
	
	@Override
	public List<ProductReport> getProductReportByDay(String querydate, int rowstart, int rowend){
		logger.debug("querydate="+querydate+";rowstart="+rowstart+";rowend="+rowend);
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("querydate", querydate);
		paraMap.put("rowstart", rowstart);
		paraMap.put("rowend", rowend);
		logger.debug("report search begin");
		List<ProductReport> report = mapper.getProductReportByDay(paraMap);
		logger.debug("report size ="+report.size());
		return report;
	}
}
