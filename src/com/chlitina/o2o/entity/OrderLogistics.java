package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(OrderLogisticsAdapter.class)
public interface OrderLogistics {

	public String getGT_VBELN();

	public void setGT_VBELN(String gT_VBELN);

	public String getSTATUS();

	public void setSTATUS(String sTATUS);

	public String getMESSAGE();

	public void setMESSAGE(String mESSAGE);

	public String getYUNDA();

	public void setYUNDA(String yUNDA);

	public String getLIFNR();

	public void setLIFNR(String lIFNR);

}