package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StockItemAdapter.class)
public interface StockItem {

	public String getPLANT();

	public void setPLANT(String pLANT);

	public String getLOCATION();

	public void setLOCATION(String lOCATION);

	public String getMATERIAL();

	public void setMATERIAL(String mATERIAL);

	public String getUNIT();

	public void setUNIT(String uNIT);

	public String getREQ_QTY();

	public void setREQ_QTY(String rEQ_QTY);

	public String getRET_STATUS();

	public void setRET_STATUS(String rET_STATUS);

	public String getINCOM_QTY();

	public void setINCOM_QTY(String iNCOM_QTY);

}