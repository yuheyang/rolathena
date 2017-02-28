package com.chlitina.o2o.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.chlitina.o2o.entity.AccountBalanceDetail;
import com.chlitina.o2o.entity.AccountBalanceQuery;
import com.chlitina.o2o.entity.AccountBalanceTotal;
import com.chlitina.o2o.entity.FranchiseStore;
import com.chlitina.o2o.entity.OrderLogistics;
import com.chlitina.o2o.entity.SOOrderResult;
import com.chlitina.o2o.entity.StockItem;
import com.chlitina.o2o.entity.StoreRecharge;
import com.chlitina.o2o.entity.StoreRechargeResult;
import com.chlitina.o2o.entity.impl.AccountBalanceQueryImpl;
import com.chlitina.o2o.entity.impl.StockItemImpl;
import com.chlitina.o2o.entity.impl.StoreRechargeImpl;
import com.chlitina.o2o.ws.BalanceService;
import com.chlitina.o2o.ws.O2OWebService;

public class TestSAP {
	BalanceService bs = new BalanceService();
	/*
	@Test
	public void testRemoveSOOrder(){
		O2OWebService bs = new BalanceService();
		SOOrderResult result = bs.removeSOOrder("130615");
		System.out.println("STATUS is "+result.getSTATUS());
		System.out.println("MESSAGE is "+result.getMESSAGE());
	}
	
	@Test
	public void testGetOrderLogistics(){
		O2OWebService bs = new BalanceService();
		OrderLogistics logistics = bs.getOrderLogistics("17");
		System.out.println("STATUS is "+logistics.getSTATUS());
		System.out.println("MESSAGE is "+logistics.getMESSAGE());
		System.out.println("YUNDA is "+logistics.getYUNDA());
		System.out.println("LIFNR is "+logistics.getLIFNR());
	}
	

	public void testGetStockItem(){
		O2OWebService bs = new BalanceService();
		StockItem stock = new StockItemImpl();
		stock.setPLANT("1091");
		stock.setLOCATION("1A04");
		stock.setMATERIAL("11010004");
		stock.setUNIT("PC");
		stock.setREQ_QTY("2");
		List<StockItem> tempList = new ArrayList<StockItem>();
		tempList.add(stock);
		List<StockItem> resultList = bs.getStockItem(tempList);
		System.out.println("RET_STATUS is "+resultList.get(0).getRET_STATUS());
		System.out.println("INCOM_QTY is "+resultList.get(0).getINCOM_QTY());
	}
	

	public void testGetFranchiseStore(){
		O2OWebService bs = new BalanceService();
		FranchiseStore store = bs.getFranchiseStore("1100110001");
		System.out.println("STATUS is "+store.getSTATUS());
		System.out.println("BFLAG is "+store.getBFLAG());
		System.out.println("message is "+store.getMESSAGE());
	}
	
	@Test
	public void testSaveStoreRecharge2Sap(){
		BalanceService bs = new BalanceService();
		StoreRecharge recharge = new StoreRechargeImpl();
		recharge.setIBXNO("0000000001");
		recharge.setBUKRS("1009");
		recharge.setUNAME("WUYIYI");
		recharge.setERDAT("20150817");
		recharge.setBUDAT("20150817");
		recharge.setRCCOD("1009C");
		recharge.setKUNNR("1100110001");
		recharge.setWAERS("RMB");
		recharge.setWRBTR("100000.00");
		recharge.setREDOC("K20150817100000");
		recharge.setTRSTP("01");
		recharge.setYAJIN("");
		recharge.setZLSCH("13");
		recharge.setHKONT("10120007");
		StoreRechargeResult result = bs.saveStoreRecharge2Sap(recharge);
		System.out.println("IBXNO is "+result.getIBXNO());
		System.out.println("TYP is "+result.getTYPE());
		System.out.println("BELN is "+result.getBELNR());
	}
	
	@Test
	public void testAccountBalance(){
		AccountBalanceQuery query = new AccountBalanceQueryImpl();
		query.setQuerytype("1");
		query.setCredit("1009");
		query.setKunnrstart("1100018910");
		query.setDetailstart("20150601");
		query.setDetailend("20150630");
		List resultList = bs.getAccountBalanceDetail(query);
		System.out.println(resultList.size()+";"+((AccountBalanceDetail)(resultList.get(0))).getNAME1()+";"+((AccountBalanceDetail)(resultList.get(0))).getTOTAL());
	}*/
	
	@Test
	public void testAccountBalanceTotal(){
		AccountBalanceQuery query = new AccountBalanceQueryImpl();
		query.setCredit("1009");
		query.setKunnrstart("1100018910");
		query.setDetailstart("20150601");
		query.setDetailend("20150630");
		List resultList = bs.getAccountBalanceTotal(query);
		System.out.println(resultList.size()+";"+((AccountBalanceTotal)(resultList.get(0))).getKUNNR()+";"+((AccountBalanceTotal)(resultList.get(0))).getRecorderList().size());
	}
}
