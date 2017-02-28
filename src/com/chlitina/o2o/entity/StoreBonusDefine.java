package com.chlitina.o2o.entity;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StoreBonusDefineAdapter.class)
public interface StoreBonusDefine {

	public BigDecimal getBonusMonth();

	public void setBonusMonth(BigDecimal bonusMonth);

	public BigDecimal getBonusYear();

	public void setBonusYear(BigDecimal bonusYear);

	public String getBusinessType();

	public void setBusinessType(String businessType);

	public String getCommendJmd();

	public void setCommendJmd(String commendJmd);

	public String getCommendZxs();

	public void setCommendZxs(String commendZxs);

	public BigDecimal getIsReal();

	public void setIsReal(BigDecimal isReal);

	public String getMemberType();

	public void setMemberType(String memberType);

	public String getOrderCode();

	public void setOrderCode(String orderCode);

	public String getOrg();

	public void setOrg(String org);

	public BigDecimal getSumJf();

	public void setSumJf(BigDecimal sumJf);

	public BigDecimal getSumMon();

	public void setSumMon(BigDecimal sumMon);

	public BigDecimal getVersion();

	public void setVersion(BigDecimal version);

	public BigDecimal getZxsBonus();

	public void setZxsBonus(BigDecimal zxsBonus);

	public String getZxsCode();

	public void setZxsCode(String zxsCode);

	public String getZxsId();

	public void setZxsId(String zxsId);

	public String getZxsName();

	public void setZxsName(String zxsName);

}