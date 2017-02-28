package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlJavaTypeAdapter(SOOrderDetailPromotionAdapter.class)
public interface SOOrderDetailPromotion {

	public abstract String getMATNR();

	public abstract void setMATNR(String mATNR);

	public abstract String getARKTX();

	public abstract void setARKTX(String aRKTX);

	public abstract String getKWMENG();

	public abstract void setKWMENG(String kWMENG);

	public abstract String getZZAFAMT();

	public abstract void setZZAFAMT(String zZAFAMT);

	public abstract String getZZBVVALUE();

	public abstract void setZZBVVALUE(String zZBVVALUE);

	public abstract String getISPRESENT();

	public abstract void setISPRESENT(String iSPRESENT);

	public abstract String getERDAT();

	public abstract void setERDAT(String eRDAT);

	public abstract String getVRKME();

	public abstract void setVRKME(String vRKME);

}