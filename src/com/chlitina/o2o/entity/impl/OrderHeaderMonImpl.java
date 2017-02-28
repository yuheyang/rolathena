package com.chlitina.o2o.entity.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.OrderHeaderMon;
import com.chlitina.o2o.entity.OrderItemMon;

@XmlType(name="OrderHeaderMon")
public class OrderHeaderMonImpl implements OrderHeaderMon {
	private static final long serialVersionUID = 1L;

	private String vbeln;

	private String auart;

	private String kunnr;

	private String memberLevel;

	private String name1;

	private String orderHdExpl;

	private String orderTpName;

	private String orgName;

	private String readFlag;

	private String saleDate;

	private String saleDistrict;

	private String salePeriod;

	private double sumBv;

	private double sumMoney;

	private String vkorg;
	
	private String zzcperi;

	private List<OrderItemMon> items;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getAuart()
	 */
	@Override
	public String getAuart() {
		return this.auart;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setAuart(java.lang.String)
	 */
	@Override
	public void setAuart(String auart) {
		this.auart = auart;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getKunnr()
	 */
	@Override
	public String getKunnr() {
		return this.kunnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setKunnr(java.lang.String)
	 */
	@Override
	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getMemberLevel()
	 */
	@Override
	public String getMemberLevel() {
		return this.memberLevel;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setMemberLevel(java.lang.String)
	 */
	@Override
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getName1()
	 */
	@Override
	public String getName1() {
		return this.name1;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setName1(java.lang.String)
	 */
	@Override
	public void setName1(String name1) {
		this.name1 = name1;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getOrderHdExpl()
	 */
	@Override
	public String getOrderHdExpl() {
		return this.orderHdExpl;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setOrderHdExpl(java.lang.String)
	 */
	@Override
	public void setOrderHdExpl(String orderHdExpl) {
		this.orderHdExpl = orderHdExpl;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getOrderTpName()
	 */
	@Override
	public String getOrderTpName() {
		return this.orderTpName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setOrderTpName(java.lang.String)
	 */
	@Override
	public void setOrderTpName(String orderTpName) {
		this.orderTpName = orderTpName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getOrgName()
	 */
	@Override
	public String getOrgName() {
		return this.orgName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setOrgName(java.lang.String)
	 */
	@Override
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getReadFlag()
	 */
	@Override
	public String getReadFlag() {
		return this.readFlag;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setReadFlag(java.lang.String)
	 */
	@Override
	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getSaleDate()
	 */
	@Override
	public String getSaleDate() {
		return this.saleDate;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setSaleDate(java.lang.String)
	 */
	@Override
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getSaleDistrict()
	 */
	@Override
	public String getSaleDistrict() {
		return this.saleDistrict;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setSaleDistrict(java.lang.String)
	 */
	@Override
	public void setSaleDistrict(String saleDistrict) {
		this.saleDistrict = saleDistrict;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getSalePeriod()
	 */
	@Override
	public String getSalePeriod() {
		return this.salePeriod;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setSalePeriod(java.lang.String)
	 */
	@Override
	public void setSalePeriod(String salePeriod) {
		this.salePeriod = salePeriod;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getSumBv()
	 */
	@Override
	public double getSumBv() {
		return this.sumBv;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setSumBv(double)
	 */
	@Override
	public void setSumBv(double sumBv) {
		this.sumBv = sumBv;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getSumMoney()
	 */
	@Override
	public double getSumMoney() {
		return this.sumMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setSumMoney(double)
	 */
	@Override
	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getVkorg()
	 */
	@Override
	public String getVkorg() {
		return this.vkorg;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setVkorg(java.lang.String)
	 */
	@Override
	public void setVkorg(String vkorg) {
		this.vkorg = vkorg;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getVbeln()
	 */
	@Override
	public String getVbeln() {
		return vbeln;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setVbeln(java.lang.String)
	 */
	@Override
	public void setVbeln(String vbeln) {
		this.vbeln = vbeln;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#getItems()
	 */
	@Override
	public List<OrderItemMon> getItems() {
		return items;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeaderMon#setItems(java.util.List)
	 */
	@Override
	public void setItems(List<OrderItemMon> items) {
		this.items = items;
	}

	@Override
	public String getZzcperi() {
		return zzcperi;
	}

	@Override
	public void setZzcperi(String zzcperi) {
		this.zzcperi = zzcperi;
	}
	
	
}
