package com.chlitina.o2o.entity;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(SOOrderAdapter.class)
public interface SOOrder {

	public abstract String getVKORG();

	public abstract void setVKORG(String vKORG);

	public abstract String getVTWEG();

	public abstract void setVTWEG(String vTWEG);

	public abstract String getSOLD_TO();

	public abstract void setSOLD_TO(String sOLD_TO);

	public abstract String getSHIP_TO();

	public abstract void setSHIP_TO(String sHIP_TO);

	public abstract String getBSTKD();

	public abstract void setBSTKD(String bSTKD);

	public abstract String getREMARK();

	public abstract void setREMARK(String rEMARK);

	public abstract String getSO_NUMBER();

	public abstract void setSO_NUMBER(String sO_NUMBER);

	public abstract String getSTATUS();

	public abstract void setSTATUS(String sTATUS);

	public abstract String getMESSAGE();

	public abstract void setMESSAGE(String mESSAGE);
	
	public abstract List<SOOrderDetail> getDetailList();

	public abstract void setDetailList(List<SOOrderDetail> detailList);
	
	public abstract String getCITY();

	public abstract void setCITY(String city);
	
	public abstract String getSTREET();

	public abstract void setSTREET(String sTREET);
	
	public abstract void setVKBUR(String vKBUR);
	
	public abstract String getVKBUR();
}