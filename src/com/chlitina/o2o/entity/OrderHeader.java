package com.chlitina.o2o.entity;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(OrderHeaderAdapter.class)
public interface OrderHeader {

	public String getAuart();

	public void setAuart(String auart);

	public String getDocStatus();

	public void setDocStatus(String docStatus);

	public String getKunnr();

	public void setKunnr(String kunnr);

	public String getMemberLevel();

	public void setMemberLevel(String memberLevel);

	public String getName1();

	public void setName1(String name1);

	public String getOrderHdExpl();

	public void setOrderHdExpl(String orderHdExpl);

	public String getOrderTpName();

	public void setOrderTpName(String orderTpName);

	public String getOrgName();

	public void setOrgName(String orgName);

	public String getReadFlag();

	public void setReadFlag(String readFlag);

	public String getSaleDate();

	public void setSaleDate(String saleDate);

	public String getSaleDistrict();

	public void setSaleDistrict(String saleDistrict);

	public String getSalePeriod();

	public void setSalePeriod(String salePeriod);

	public String getSdate();

	public void setSdate(String sdate);

	public double getSumBv();

	public void setSumBv(double sumBv);

	public double getSumMoney();

	public void setSumMoney(double sumMoney);

	public String getVkorg();

	public void setVkorg(String vkorg);

	public String getVbeln();

	public void setVbeln(String vbeln);

	public List<OrderItem> getOrderItems();

	public void setOrderItems(List<OrderItem> orderItems);

	public String getCdate();

	public void setCdate(String cdate);
}