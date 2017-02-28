package com.chlitina.o2o.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chlitina.o2o.entity.SOOrder;
import com.chlitina.o2o.entity.SOOrderDetail;
import com.chlitina.o2o.entity.SOOrderResult;
import com.chlitina.o2o.entity.impl.SOOrderDetailImpl;
import com.chlitina.o2o.entity.impl.SOOrderImpl;
import com.chlitina.o2o.ws.BalanceService;
import com.chlitina.o2o.ws.O2OWebService;

public class TestBalanceService {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBalanceByCustNo() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(O2OWebService.class);
        factory.setAddress("http://localhost:8081/o2ows/O2OWebService");
        
        O2OWebService service = (O2OWebService) factory.create();
        
        System.out.println("#############Client getBalanceByCustNo##############");
        String balance = service.getBalanceByCustNo("1100005183");
        System.out.println(balance);
	}
	
	@Test
	public void testCreateSOOrder() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(O2OWebService.class);
        factory.setAddress("http://localhost:8081/o2ows/O2OWebService");
        
        O2OWebService service = (O2OWebService) factory.create();
        
        System.out.println("#############Client createSOOrder##############");
		SOOrder order = new SOOrderImpl();
		order.setVKORG("1009");
		order.setVTWEG("10");
		order.setSOLD_TO("1100110001");
		order.setSHIP_TO("1100110001");
		SOOrderDetail detail = new SOOrderDetailImpl();
		detail.setPOSNR(000010);
		detail.setMATNR("11010004");
		detail.setSO_QTY("3");
		detail.setSO_UNIT("PC");
		detail.setWERKS("1091");
		detail.setLGORT("1A04");
		detail.setVSTEL("109C");
		List detailList = new ArrayList();
		detailList.add(detail);
		order.setDetailList(detailList);
		
		SOOrderResult result = service.createSOOrder(order); 
		
		System.out.println("SO_NUMBER is "+result.getSO_NUMBER());
		System.out.println("STATUS is "+result.getSTATUS());
		System.out.println("MESSAGE is "+result.getMESSAGE());
	}

}
