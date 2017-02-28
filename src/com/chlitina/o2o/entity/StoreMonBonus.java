package com.chlitina.o2o.entity;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StoreMonBonusAdapter.class)
public interface StoreMonBonus {

	public BigDecimal getBonusMon();

	public void setBonusMon(BigDecimal bonusMon);

	public BigDecimal getBonusYear();

	public void setBonusYear(BigDecimal bonusYear);

	public BigDecimal getMemberBonus();

	public void setMemberBonus(BigDecimal memberBonus);

	public BigDecimal getMemberId();

	public void setMemberId(BigDecimal memberId);

	public BigDecimal getMemberJf();

	public void setMemberJf(BigDecimal memberJf);

	public String getMemberLevel();

	public void setMemberLevel(String memberLevel);

	public BigDecimal getTeamJf();

	public void setTeamJf(BigDecimal teamJf);
	
	public BigDecimal getO2oTeamBonus();

	public void setO2oTeamBonus(BigDecimal o2oTeamBonus);

	public BigDecimal getO2oSaleBonus();

	public void setO2oSaleBonus(BigDecimal o2oSaleBonus);

	public BigDecimal getO2oJF();

	public void setO2oJF(BigDecimal o2oJF);

	public BigDecimal getBonusDis();

	public void setBonusDis(BigDecimal bonusDis);
	
	public BigDecimal getNextBonus();

	public void setNextBonus(BigDecimal nextBonus);

}