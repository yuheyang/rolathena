package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(BalanceRecorderAdapter.class)
public interface BalanceRecorder {

	public String getID();

	public void setID(String iD);

	public String getDES();

	public void setDES(String dES);

	public String getDMBTR();

	public void setDMBTR(String dMBTR);

}