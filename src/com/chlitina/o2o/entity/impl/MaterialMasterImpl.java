package com.chlitina.o2o.entity.impl;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.MaterialMaster;

@XmlType(name= "MaterialMaster")
public class MaterialMasterImpl implements MaterialMaster {
	private static final long serialVersionUID = 1L;

	private String matnr;

	private BigDecimal bvAmount;

	private String cateId;

	private String cateName;

	private String country;

	private BigDecimal facPrice;

	private String isPresent;

	private String loevm;

	private BigDecimal lowPrice;

	private double minQty;

	private String mktxt;

	private BigDecimal price;

	private String priceGroup;

	private String readFlag;

	private String remark;

	private String seriesId;

	private String seriesName;

	private String shortname;

	private String subseriesId;

	private String subseriesName;

	private String unit;

	private String upDownStat;
	
	private String vmsta;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getMatnr()
	 */
	@Override
	public String getMatnr() {
		return this.matnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setMatnr(java.lang.String)
	 */
	@Override
	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getBvAmount()
	 */
	@Override
	public BigDecimal getBvAmount() {
		return this.bvAmount;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setBvAmount(java.math.BigDecimal)
	 */
	@Override
	public void setBvAmount(BigDecimal bvAmount) {
		this.bvAmount = bvAmount;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getCateId()
	 */
	@Override
	public String getCateId() {
		return this.cateId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setCateId(java.lang.String)
	 */
	@Override
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getCateName()
	 */
	@Override
	public String getCateName() {
		return this.cateName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setCateName(java.lang.String)
	 */
	@Override
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getCountry()
	 */
	@Override
	public String getCountry() {
		return this.country;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setCountry(java.lang.String)
	 */
	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getFacPrice()
	 */
	@Override
	public BigDecimal getFacPrice() {
		return this.facPrice;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setFacPrice(java.math.BigDecimal)
	 */
	@Override
	public void setFacPrice(BigDecimal facPrice) {
		this.facPrice = facPrice;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getIsPresent()
	 */
	@Override
	public String getIsPresent() {
		return this.isPresent;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setIsPresent(java.lang.String)
	 */
	@Override
	public void setIsPresent(String isPresent) {
		this.isPresent = isPresent;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getLoevm()
	 */
	@Override
	public String getLoevm() {
		return this.loevm;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setLoevm(java.lang.String)
	 */
	@Override
	public void setLoevm(String loevm) {
		this.loevm = loevm;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getLowPrice()
	 */
	@Override
	public BigDecimal getLowPrice() {
		return this.lowPrice;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setLowPrice(java.math.BigDecimal)
	 */
	@Override
	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getMinQty()
	 */
	@Override
	public double getMinQty() {
		return this.minQty;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setMinQty(double)
	 */
	@Override
	public void setMinQty(double minQty) {
		this.minQty = minQty;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getMktxt()
	 */
	@Override
	public String getMktxt() {
		return this.mktxt;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setMktxt(java.lang.String)
	 */
	@Override
	public void setMktxt(String mktxt) {
		this.mktxt = mktxt;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getPrice()
	 */
	@Override
	public BigDecimal getPrice() {
		return this.price;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setPrice(java.math.BigDecimal)
	 */
	@Override
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getPriceGroup()
	 */
	@Override
	public String getPriceGroup() {
		return this.priceGroup;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setPriceGroup(java.lang.String)
	 */
	@Override
	public void setPriceGroup(String priceGroup) {
		this.priceGroup = priceGroup;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getReadFlag()
	 */
	@Override
	public String getReadFlag() {
		return this.readFlag;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setReadFlag(java.lang.String)
	 */
	@Override
	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getRemark()
	 */
	@Override
	public String getRemark() {
		return this.remark;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setRemark(java.lang.String)
	 */
	@Override
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getSeriesId()
	 */
	@Override
	public String getSeriesId() {
		return this.seriesId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setSeriesId(java.lang.String)
	 */
	@Override
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getSeriesName()
	 */
	@Override
	public String getSeriesName() {
		return this.seriesName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setSeriesName(java.lang.String)
	 */
	@Override
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getShortname()
	 */
	@Override
	public String getShortname() {
		return this.shortname;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setShortname(java.lang.String)
	 */
	@Override
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getSubseriesId()
	 */
	@Override
	public String getSubseriesId() {
		return this.subseriesId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setSubseriesId(java.lang.String)
	 */
	@Override
	public void setSubseriesId(String subseriesId) {
		this.subseriesId = subseriesId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getSubseriesName()
	 */
	@Override
	public String getSubseriesName() {
		return this.subseriesName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setSubseriesName(java.lang.String)
	 */
	@Override
	public void setSubseriesName(String subseriesName) {
		this.subseriesName = subseriesName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getUnit()
	 */
	@Override
	public String getUnit() {
		return this.unit;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setUnit(java.lang.String)
	 */
	@Override
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#getUpDownStat()
	 */
	@Override
	public String getUpDownStat() {
		return this.upDownStat;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.MaterialMaster#setUpDownStat(java.lang.String)
	 */
	@Override
	public void setUpDownStat(String upDownStat) {
		this.upDownStat = upDownStat;
	}

	public String getVmsta() {
		return vmsta;
	}

	public void setVmsta(String vmsta) {
		this.vmsta = vmsta;
	}
	
	
}
