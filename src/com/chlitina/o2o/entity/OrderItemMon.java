package com.chlitina.o2o.entity;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.chlitina.o2o.entity.impl.OrderItemMonImpl;

@XmlJavaTypeAdapter(OrderItemMonAdapter.class)
public interface OrderItemMon {

	public String getIsPersent();

	public void setIsPersent(String isPersent);

	public double getItemJf();

	public void setItemJf(double itemJf);

	public double getItemMoney();

	public void setItemMoney(double itemMoney);

	public String getItemName();

	public void setItemName(String itemName);

	public BigDecimal getItemQty();

	public void setItemQty(BigDecimal itemQty);

	public String getMatnr();

	public void setMatnr(String matnr);

	public double getPerJf();

	public void setPerJf(double perJf);

	public double getPerMoney();

	public void setPerMoney(double perMoney);

	public String getVbeln();

	public void setVbeln(String vbeln);

	public String getZzcperi();

	public void setZzcperi(String zzcperi);
}