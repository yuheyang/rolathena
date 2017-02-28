package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.OrderItem;

@XmlType(name="OrderItem")
public class OrderItemImpl implements OrderItem {
	private static final long serialVersionUID = 1L;

	private String vbeln;
	
	private String posnr;

	private String isPersent;

	private double itemJf;

	private double itemMoney;

	private String itemName;

	private double itemQty;

	private String matnr;

	private double perJf;

	private double perMoney;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getIsPersent()
	 */
	@Override
	public String getIsPersent() {
		return this.isPersent;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setIsPersent(java.lang.String)
	 */
	@Override
	public void setIsPersent(String isPersent) {
		this.isPersent = isPersent;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getItemJf()
	 */
	@Override
	public double getItemJf() {
		return this.itemJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setItemJf(double)
	 */
	@Override
	public void setItemJf(double itemJf) {
		this.itemJf = itemJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getItemMoney()
	 */
	@Override
	public double getItemMoney() {
		return this.itemMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setItemMoney(double)
	 */
	@Override
	public void setItemMoney(double itemMoney) {
		this.itemMoney = itemMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getItemName()
	 */
	@Override
	public String getItemName() {
		return this.itemName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setItemName(java.lang.String)
	 */
	@Override
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getItemQty()
	 */
	@Override
	public double getItemQty() {
		return this.itemQty;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setItemQty(double)
	 */
	@Override
	public void setItemQty(double itemQty) {
		this.itemQty = itemQty;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getMatnr()
	 */
	@Override
	public String getMatnr() {
		return this.matnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setMatnr(java.lang.String)
	 */
	@Override
	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getPerJf()
	 */
	@Override
	public double getPerJf() {
		return this.perJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setPerJf(double)
	 */
	@Override
	public void setPerJf(double perJf) {
		this.perJf = perJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getPerMoney()
	 */
	@Override
	public double getPerMoney() {
		return this.perMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setPerMoney(double)
	 */
	@Override
	public void setPerMoney(double perMoney) {
		this.perMoney = perMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#getVbeln()
	 */
	@Override
	public String getVbeln() {
		return vbeln;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderItem#setVbeln(java.lang.String)
	 */
	@Override
	public void setVbeln(String vbeln) {
		this.vbeln = vbeln;
	}

	@Override
	public String getPosnr() {
		return posnr;
	}

	@Override
	public void setPosnr(String posnr) {
		this.posnr = posnr;
	}

	
}
