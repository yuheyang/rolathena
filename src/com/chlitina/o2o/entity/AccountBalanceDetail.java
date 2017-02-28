package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(AccountBalanceDetailAdapter.class)
public interface AccountBalanceDetail {

	public String getKKBER();

	public void setKKBER(String kKBER);

	public String getKUNNR();

	public void setKUNNR(String kUNNR);

	public String getSERNO();

	public void setSERNO(String sERNO);

	public String getNAME1();

	public void setNAME1(String nAME1);

	public String getNAME2();

	public void setNAME2(String nAME2);

	public String getORAMT();

	public void setORAMT(String oRAMT);

	public String getIOAMT();

	public void setIOAMT(String iOAMT);

	public String getTOTAL();

	public void setTOTAL(String tOTAL);

	public String getWAERS();

	public void setWAERS(String wAERS);

	public String getBUDAT();

	public void setBUDAT(String bUDAT);

	public String getDOCNO();

	public void setDOCNO(String dOCNO);

	public String getVKBUR();

	public void setVKBUR(String vKBUR);

	public String getREMARK();

	public void setREMARK(String rEMARK);

	public String getUNAME();

	public void setUNAME(String uNAME);

	public String getOBLIG();

	public void setOBLIG(String oBLIG);

	public String getSKFOR();

	public void setSKFOR(String sKFOR);

	public String getSSOBL();

	public void setSSOBL(String sSOBL);

	public String getSAUFT();

	public void setSAUFT(String sAUFT);

	public String getBEZEI();

	public void setBEZEI(String bEZEI);

	public String getTIME();

	public void setTIME(String tIME);

	public String getSOURCE();

	public void setSOURCE(String sOURCE);
	
	public String getTYPE();
	
	public void setTYPE(String tYPE);


}