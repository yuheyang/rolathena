package com.chlitina.o2o.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="SOOrderResult")  
@XmlJavaTypeAdapter(SOOrderResultAdapter.class)
public interface SOOrderResult {

	public String getSO_NUMBER();

	public void setSO_NUMBER(String sO_NUMBER);

	public String getSTATUS();

	public void setSTATUS(String sTATUS);

	public String getMESSAGE();

	public void setMESSAGE(String mESSAGE);

	public List<SOOrderDetailPromotion> getList();

	public void setList(List<SOOrderDetailPromotion> list);

}