package com.chlitina.o2o.entity;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StoreMonBonusSecAdapter.class)
public interface StoreMonBonusSec {

	public BigDecimal getDnMoney();

	public void setDnMoney(BigDecimal dnMoney);

	public BigDecimal getMemberBonus();

	public void setMemberBonus(BigDecimal memberBonus);

	public String getMemberId();

	public void setMemberId(String memberId);

	public String getPeriod();

	public void setPeriod(String period);

}