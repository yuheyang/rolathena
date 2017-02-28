package com.chlitina.o2o.entity.impl;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.OrderItemMon;

@XmlType(name="OrderItemMon")
public class OrderItemMonImpl implements OrderItemMon {
	private static final long serialVersionUID = 1L;

	private String vbeln;
	
	private String zzcperi;

	private String isPersent;

	private double itemJf;

	private double itemMoney;

	private String itemName;

	private BigDecimal itemQty;

	private String matnr;

	private double perJf;

	private double perMoney;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getIsPersent()
	 */
	@Override
	public String getIsPersent() {
		return this.isPersent;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setIsPersent(java.lang.String)
	 */
	@Override
	public void setIsPersent(String isPersent) {
		this.isPersent = isPersent;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getItemJf()
	 */
	@Override
	public double getItemJf() {
		return this.itemJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setItemJf(double)
	 */
	@Override
	public void setItemJf(double itemJf) {
		this.itemJf = itemJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getItemMoney()
	 */
	@Override
	public double getItemMoney() {
		return this.itemMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setItemMoney(double)
	 */
	@Override
	public void setItemMoney(double itemMoney) {
		this.itemMoney = itemMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getItemName()
	 */
	@Override
	public String getItemName() {
		return this.itemName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setItemName(java.lang.String)
	 */
	@Override
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getItemQty()
	 */
	@Override
	public BigDecimal getItemQty() {
		return this.itemQty;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setItemQty(java.math.BigDecimal)
	 */
	@Override
	public void setItemQty(BigDecimal itemQty) {
		this.itemQty = itemQty;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getMatnr()
	 */
	@Override
	public String getMatnr() {
		return this.matnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setMatnr(java.lang.String)
	 */
	@Override
	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getPerJf()
	 */
	@Override
	public double getPerJf() {
		return this.perJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setPerJf(double)
	 */
	@Override
	public void setPerJf(double perJf) {
		this.perJf = perJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getPerMoney()
	 */
	@Override
	public double getPerMoney() {
		return this.perMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setPerMoney(double)
	 */
	@Override
	public void setPerMoney(double perMoney) {
		this.perMoney = perMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#getVbeln()
	 */
	@Override
	public String getVbeln() {
		return vbeln;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItemMon#setVbeln(java.lang.String)
	 */
	@Override
	public void setVbeln(String vbeln) {
		this.vbeln = vbeln;
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
