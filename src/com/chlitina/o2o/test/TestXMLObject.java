package com.chlitina.o2o.test;

import static org.junit.Assert.*;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chlitina.o2o.entity.SOOrderResult;
import com.chlitina.o2o.entity.impl.SOOrderResultImpl;

public class TestXMLObject {
 
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
	public void test() {
		SOOrderResult rc = new SOOrderResultImpl();  
        JAXBContext context;  
        try {  
            context = JAXBContext.newInstance(SOOrderResultImpl.class);  
            Marshaller mar = context.createMarshaller();  
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
            mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");  

            StringWriter writer = new StringWriter();
            //mar.marshal(rc, writer);
            System.out.println(writer.toString());  
        } catch (JAXBException e) {  
            e.printStackTrace();  
        }  
	}

}
