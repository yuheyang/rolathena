package com.chlitina.o2o.entity;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(MaterialMasterAdapter.class)
public interface MaterialMaster {

	public String getMatnr();

	public void setMatnr(String matnr);

	public BigDecimal getBvAmount();

	public void setBvAmount(BigDecimal bvAmount);

	public String getCateId();

	public void setCateId(String cateId);

	public String getCateName();

	public void setCateName(String cateName);

	public String getCountry();

	public void setCountry(String country);

	public BigDecimal getFacPrice();

	public void setFacPrice(BigDecimal facPrice);

	public String getIsPresent();

	public void setIsPresent(String isPresent);

	public String getLoevm();

	public void setLoevm(String loevm);

	public BigDecimal getLowPrice();

	public void setLowPrice(BigDecimal lowPrice);

	public double getMinQty();

	public void setMinQty(double minQty);

	public String getMktxt();

	public void setMktxt(String mktxt);

	public BigDecimal getPrice();

	public void setPrice(BigDecimal price);

	public String getPriceGroup();

	public void setPriceGroup(String priceGroup);

	public String getReadFlag();

	public void setReadFlag(String readFlag);

	public String getRemark();

	public void setRemark(String remark);

	public String getSeriesId();

	public void setSeriesId(String seriesId);

	public String getSeriesName();

	public void setSeriesName(String seriesName);

	public String getShortname();

	public void setShortname(String shortname);

	public String getSubseriesId();

	public void setSubseriesId(String subseriesId);

	public String getSubseriesName();

	public void setSubseriesName(String subseriesName);

	public String getUnit();

	public void setUnit(String unit);

	public String getUpDownStat();

	public void setUpDownStat(String upDownStat);
	
	public String getVmsta();

	public void setVmsta(String vmsta);

}