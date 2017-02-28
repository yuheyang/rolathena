package com.chlitina.o2o.test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chlitina.o2o.entity.AreaBonus;
import com.chlitina.o2o.entity.CustMaster;
import com.chlitina.o2o.entity.MaterialMaster;
import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.ProductReport;
import com.chlitina.o2o.entity.StoreBonusDefine;
import com.chlitina.o2o.entity.StoreMonBonusSec;
import com.chlitina.o2o.service.IntermediateService;

@RunWith(SpringJUnit4ClassRunner.class)  
//因为我们没有启动web工程，所以无法通过web.xml执行执行spring-configuration.xml文件了，所以在这里要显示的声明执行。  
@ContextConfiguration(locations = { "classpath:/META-INF/spring/applicationContext-mybatis.xml" })  
public class TestDao {
  
	@Resource(name = "O2OIntermediateService")   
	private IntermediateService service;
	
	@Test
	public void testGetCustMaster(){
		System.out.println("testGetCustMaster");
		//List<MaterialMaster> mm = service.getMaterialMaster(0,10);
		//System.out.println(mm.get(5).getMatnr()+";"+mm.get(5).getCateName()+";"+mm.get(5).getMktxt()+";"+mm.get(5).getSeriesName());
		//List<CustMaster> mm = service.getCustMaster(0,10);
		//System.out.println(mm.get(5).getMobileTel()+";"+mm.get(5).getCdate()+";"+mm.get(5).getConsultName()+";"+mm.get(5).getCityName());
		//int count = service.getCustMasterCount();
		//System.out.println(count);
		//List<StoreMonBonusSec> mm = service.getStoreMonBonusSec("2015年06月",0,10);
		//System.out.println(mm.get(5).getDnMoney()+";"+mm.get(5).getMemberBonus()+";"+mm.get(2).getPeriod()+";"+mm.get(2).getMemberId());
		//List<StoreBonusDefine> mm = service.getStoreBonusDefine("2015", "06", 0,10);
		//System.out.println(mm.get(0).getZxsName()+";"+mm.get(5).gtSumMon()+";"+mm.get(5).getZxsCode());
		//List<OrderHeader> mm = service.getOrdersByDay("20150820", 0, 10);
		//System.out.println(mm.get(0).getKunnr()+";"+mm.get(0).getName1()+";item size:"+mm.get(0).getOrderItems().size()+";"+mm.get(0).getOrderItems().get(1).getPosnr());
		//List<StoreBonusDefine> mm = service.getStoreBonusDefine("2015", "06", 0,10);
		//System.out.println(mm.get(0).getZxsName()+";"+mm.get(5).getSumMon()+";"+mm.get(5).getZxsCode());
		//List<AreaBonus> mm = service.getAreaBonusByDay("20151016", 0,10000);
		//System.out.println(mm.get(0).getBztxt());
		//System.out.println("testGetCustMaster over");
		//List<ProductReport> mm = service.getProductReportByDay("20151016", 0,10000);
		//System.out.println(mm.get(0).getARKTX());
		//System.out.println("getProductReportByDay over");
		
	}
}
