package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StoreRechargeAdapter.class)
public interface StoreRecharge {

	public String getIBXNO();

	public void setIBXNO(String iBXNO);

	public String getBUKRS();

	public void setBUKRS(String bUKRS);

	public String getUNAME();

	public void setUNAME(String uNAME);

	public String getERDAT();

	public void setERDAT(String eRDAT);

	public String getBUDAT();

	public void setBUDAT(String bUDAT);

	public String getRCCOD();

	public void setRCCOD(String rCCOD);

	public String getKUNNR();

	public void setKUNNR(String kUNNR);

	public String getWAERS();

	public void setWAERS(String wAERS);

	public String getWRBTR();

	public void setWRBTR(String wRBTR);

	public String getREDOC();

	public void setREDOC(String rEDOC);

	public String getTRSTP();

	public void setTRSTP(String tRSTP);

	public String getYAJIN();

	public void setYAJIN(String yAJIN);

	public String getZLSCH();

	public void setZLSCH(String zLSCH);

	public String getHKONT();

	public void setHKONT(String hKONT);

	public String getDREMAK();

	public void setDREMAK(String dREMAK);

}