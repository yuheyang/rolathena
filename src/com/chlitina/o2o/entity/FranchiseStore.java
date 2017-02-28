package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(FranchiseStoreAdapter.class)
public interface FranchiseStore {

	public String getKUNNR();

	public void setKUNNR(String kUNNR);

	public String getBFLAG();

	public void setBFLAG(String bFLAG);

	public String getSTATUS();

	public void setSTATUS(String sTATUS);

	public String getMESSAGE();

	public void setMESSAGE(String mESSAGE);

}