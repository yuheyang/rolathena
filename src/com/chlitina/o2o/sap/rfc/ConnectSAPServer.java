package com.chlitina.o2o.sap.rfc;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

import com.chlitina.o2o.common.DbUtil;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.ext.DestinationDataProvider;


public class ConnectSAPServer {

    static String ABAP_AS_POOLED = "ABAP_AS_WITHOUT_POOL1";

    static{
       Properties connectProperties = new Properties();
       Properties sapproperties = DbUtil.loadSapProperties();
       
       connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST,sapproperties.getProperty("ashost"));//SAP ������
       connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR,sapproperties.getProperty("sysnr"));//ϵͳ���
       connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT,sapproperties.getProperty("client"));//SAP����  
       connectProperties.setProperty(DestinationDataProvider.JCO_USER,sapproperties.getProperty("user"));//SAP�û��� 
       connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD,sapproperties.getProperty("passwd"));//����
       connectProperties.setProperty(DestinationDataProvider.JCO_LANG,sapproperties.getProperty("langu"));//��¼���� 
       connectProperties.setProperty(DestinationDataProvider.JCO_POOL_CAPACITY,"50" );//���������
       connectProperties.setProperty(DestinationDataProvider.JCO_PEAK_LIMIT,"100" );//��������߳�  
       createDataFile(ABAP_AS_POOLED,"jcoDestination",connectProperties);
    }

    static void createDataFile(String name, String suffix,Properties properties) {
       File cfg = new File(name+"."+suffix);
       if (!cfg.exists()) {
           try {
              FileOutputStream fos = new FileOutputStream(cfg, false);
              properties.store(fos, "for test only!");
              fos.close();
           } catch (Exception e) {
              throw new RuntimeException("Unable to create the destination file:"+cfg.getName());
           }
       }

    }

    public static JCoDestination Connect(){
       JCoDestination destination = null;
       try {
           destination = JCoDestinationManager.getDestination(ABAP_AS_POOLED);
       } catch (Exception e) {
           e.getCause();
       }
       return destination;

    }


}
