package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(OrderItemAdapter.class)
public interface OrderItem {

	public String getIsPersent();

	public void setIsPersent(String isPersent);

	public double getItemJf();

	public void setItemJf(double itemJf);

	public double getItemMoney();

	public void setItemMoney(double itemMoney);

	public String getItemName();

	public void setItemName(String itemName);

	public double getItemQty();

	public void setItemQty(double itemQty);

	public String getMatnr();

	public void setMatnr(String matnr);

	public double getPerJf();

	public void setPerJf(double perJf);

	public double getPerMoney();

	public void setPerMoney(double perMoney);

	public String getVbeln();

	public void setVbeln(String vbeln);

	public String getPosnr();

	public void setPosnr(String posnr);
}