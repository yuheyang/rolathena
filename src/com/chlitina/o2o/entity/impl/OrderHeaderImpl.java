package com.chlitina.o2o.entity.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.OrderHeader;
import com.chlitina.o2o.entity.OrderItem;

@XmlType(name="OrderHeader")
public class OrderHeaderImpl implements OrderHeader {
	private static final long serialVersionUID = 1L;

	private String vbeln;

	private String auart;
	
	private String cdate;

	private String docStatus;

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

	private String sdate;

	private double sumBv;

	private double sumMoney;

	private String vkorg;

	private List<OrderItem> orderItems;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getAuart()
	 */
	@Override
	public String getAuart() {
		return this.auart;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setAuart(java.lang.String)
	 */
	@Override
	public void setAuart(String auart) {
		this.auart = auart;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getDocStatus()
	 */
	@Override
	public String getDocStatus() {
		return this.docStatus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setDocStatus(java.lang.String)
	 */
	@Override
	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getKunnr()
	 */
	@Override
	public String getKunnr() {
		return this.kunnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setKunnr(java.lang.String)
	 */
	@Override
	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getMemberLevel()
	 */
	@Override
	public String getMemberLevel() {
		return this.memberLevel;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setMemberLevel(java.lang.String)
	 */
	@Override
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getName1()
	 */
	@Override
	public String getName1() {
		return this.name1;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setName1(java.lang.String)
	 */
	@Override
	public void setName1(String name1) {
		this.name1 = name1;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getOrderHdExpl()
	 */
	@Override
	public String getOrderHdExpl() {
		return this.orderHdExpl;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setOrderHdExpl(java.lang.String)
	 */
	@Override
	public void setOrderHdExpl(String orderHdExpl) {
		this.orderHdExpl = orderHdExpl;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getOrderTpName()
	 */
	@Override
	public String getOrderTpName() {
		return this.orderTpName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setOrderTpName(java.lang.String)
	 */
	@Override
	public void setOrderTpName(String orderTpName) {
		this.orderTpName = orderTpName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getOrgName()
	 */
	@Override
	public String getOrgName() {
		return this.orgName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setOrgName(java.lang.String)
	 */
	@Override
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getReadFlag()
	 */
	@Override
	public String getReadFlag() {
		return this.readFlag;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setReadFlag(java.lang.String)
	 */
	@Override
	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getSaleDate()
	 */
	@Override
	public String getSaleDate() {
		return this.saleDate;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setSaleDate(java.lang.String)
	 */
	@Override
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getSaleDistrict()
	 */
	@Override
	public String getSaleDistrict() {
		return this.saleDistrict;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setSaleDistrict(java.lang.String)
	 */
	@Override
	public void setSaleDistrict(String saleDistrict) {
		this.saleDistrict = saleDistrict;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getSalePeriod()
	 */
	@Override
	public String getSalePeriod() {
		return this.salePeriod;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setSalePeriod(java.lang.String)
	 */
	@Override
	public void setSalePeriod(String salePeriod) {
		this.salePeriod = salePeriod;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getSdate()
	 */
	@Override
	public String getSdate() {
		return this.sdate;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setSdate(java.lang.String)
	 */
	@Override
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getSumBv()
	 */
	@Override
	public double getSumBv() {
		return this.sumBv;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setSumBv(double)
	 */
	@Override
	public void setSumBv(double sumBv) {
		this.sumBv = sumBv;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getSumMoney()
	 */
	@Override
	public double getSumMoney() {
		return this.sumMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setSumMoney(double)
	 */
	@Override
	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getVkorg()
	 */
	@Override
	public String getVkorg() {
		return this.vkorg;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setVkorg(java.lang.String)
	 */
	@Override
	public void setVkorg(String vkorg) {
		this.vkorg = vkorg;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getVbeln()
	 */
	@Override
	public String getVbeln() {
		return vbeln;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setVbeln(java.lang.String)
	 */
	@Override
	public void setVbeln(String vbeln) {
		this.vbeln = vbeln;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#getOrderItems()
	 */
	@Override
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderHeader#setOrderItems(java.util.List)
	 */
	@Override
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String getCdate() {
		return cdate;
	}

	@Override
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}


}
