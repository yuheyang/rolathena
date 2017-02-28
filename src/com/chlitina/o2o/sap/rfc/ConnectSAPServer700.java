package com.chlitina.o2o.sap.rfc;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.ext.DestinationDataProvider;


public class ConnectSAPServer700 {
	
	//static String D12 = "192.168.251.4";

    static String ABAP_AS_POOLED = "ABAP_AS_WITHOUT_POOL1";

   

    static{

       Properties connectProperties = new Properties();
       Properties sapproperties = new Properties();
       

       connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST,"192.168.251.4");//SAP ��������ַ
       System.out.print(connectProperties.getProperty("jco.client.ashost"));

       connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR,"00");//ϵͳ���?
       System.out.print(connectProperties.getProperty("jco.client.sysnr"));

       //connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT,sapproperties.getProperty("client"));//SAP����
       connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT,"700");//SAP����
       System.out.print(connectProperties.getProperty("jco.client.client"));

       connectProperties.setProperty(DestinationDataProvider.JCO_USER,"xujun");//SAP�û���

       connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD,"1122334455");//

       connectProperties.setProperty(DestinationDataProvider.JCO_LANG,"ZH");//��½����

       connectProperties.setProperty(DestinationDataProvider.JCO_POOL_CAPACITY,"3" );//���������?

       connectProperties.setProperty(DestinationDataProvider.JCO_PEAK_LIMIT,"10" );//�������?

      

       createDataFile(ABAP_AS_POOLED,"jcoDestination",connectProperties);

    }

    static void createDataFile(String name, String suffix,Properties properties) {

       // TODO Auto-generated method stub

       File cfg = new File(name+"."+suffix);

       if (!cfg.exists()) {

           try {

              FileOutputStream fos = new FileOutputStream(cfg, false);

              properties.store(fos, "for test only!");

              fos.close();

           } catch (Exception e) {

              // TODO: handle exception

              throw new RuntimeException("Unable to create the destination file:"+cfg.getName());

           }

       }

    }

   

    public static JCoDestination Connect(){

       JCoDestination destination = null;

       try {

           destination = JCoDestinationManager.getDestination(ABAP_AS_POOLED);

           System.out.println("����SAP�ɹ���");

       } catch (Exception e) {

           // TODO: handle exception

           e.getCause();

       }

       return destination;

    }


}
