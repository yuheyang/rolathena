package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(SOOrderDetailAdapter.class)
public interface SOOrderDetail {

	public abstract Integer getPOSNR();

	public abstract void setPOSNR(Integer pOSNR);

	public abstract String getMATNR();

	public abstract void setMATNR(String mATNR);

	public abstract String getSO_QTY();

	public abstract void setSO_QTY(String sO_QTY);

	public abstract String getSO_UNIT();

	public abstract void setSO_UNIT(String sO_UNIT);

	public abstract String getWERKS();

	public abstract void setWERKS(String wERKS);

	public abstract String getLGORT();

	public abstract void setLGORT(String lGORT);

	public abstract String getVSTEL();

	public abstract void setVSTEL(String vSTEL);

}