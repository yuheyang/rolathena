package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StoreRechargeResultAdapter.class)
public interface StoreRechargeResult {

	public String getIBXNO();

	public void setIBXNO(String iBXNO);

	public String getTYPE();

	public void setTYPE(String tYPE);

	public String getBELNR();

	public void setBELNR(String bELNR);

	public String getGJAHR();

	public void setGJAHR(String gJAHR);

	public String getBUKRS();

	public void setBUKRS(String bUKRS);

	public String getERRMSG();

	public void setERRMSG(String eRRMSG);

}