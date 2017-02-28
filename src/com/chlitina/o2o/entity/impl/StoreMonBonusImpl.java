package com.chlitina.o2o.entity.impl;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.StoreMonBonus;

@XmlType(name= "StoreMonBonus")
public class StoreMonBonusImpl implements StoreMonBonus {
	private static final long serialVersionUID = 1L;

	private BigDecimal bonusMon;

	private BigDecimal bonusYear;

	private BigDecimal memberBonus;

	private BigDecimal memberId;

	private BigDecimal memberJf;

	private String memberLevel;

	private BigDecimal teamJf;
	
	private BigDecimal o2oTeamBonus;//o2o组织奖金
	private BigDecimal o2oSaleBonus;//o2o销售奖金
	private BigDecimal o2oJF;//o2o积分
	private BigDecimal bonusDis;//销售折扣
	
	private BigDecimal nextBonus;//下个月奖金调整

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getBonusMon()
	 */
	@Override
	public BigDecimal getBonusMon() {
		return this.bonusMon;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setBonusMon(java.math.BigDecimal)
	 */
	@Override
	public void setBonusMon(BigDecimal bonusMon) {
		this.bonusMon = bonusMon;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getBonusYear()
	 */
	@Override
	public BigDecimal getBonusYear() {
		return this.bonusYear;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setBonusYear(java.math.BigDecimal)
	 */
	@Override
	public void setBonusYear(BigDecimal bonusYear) {
		this.bonusYear = bonusYear;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getMemberBonus()
	 */
	@Override
	public BigDecimal getMemberBonus() {
		return this.memberBonus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setMemberBonus(java.math.BigDecimal)
	 */
	@Override
	public void setMemberBonus(BigDecimal memberBonus) {
		this.memberBonus = memberBonus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getMemberId()
	 */
	@Override
	public BigDecimal getMemberId() {
		return this.memberId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setMemberId(java.math.BigDecimal)
	 */
	@Override
	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getMemberJf()
	 */
	@Override
	public BigDecimal getMemberJf() {
		return this.memberJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setMemberJf(java.math.BigDecimal)
	 */
	@Override
	public void setMemberJf(BigDecimal memberJf) {
		this.memberJf = memberJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getMemberLevel()
	 */
	@Override
	public String getMemberLevel() {
		return this.memberLevel;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setMemberLevel(java.lang.String)
	 */
	@Override
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#getTeamJf()
	 */
	@Override
	public BigDecimal getTeamJf() {
		return this.teamJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonus#setTeamJf(java.math.BigDecimal)
	 */
	@Override
	public void setTeamJf(BigDecimal teamJf) {
		this.teamJf = teamJf;
	}

	public BigDecimal getO2oTeamBonus() {
		return o2oTeamBonus;
	}

	public void setO2oTeamBonus(BigDecimal o2oTeamBonus) {
		this.o2oTeamBonus = o2oTeamBonus;
	}

	public BigDecimal getO2oSaleBonus() {
		return o2oSaleBonus;
	}

	public void setO2oSaleBonus(BigDecimal o2oSaleBonus) {
		this.o2oSaleBonus = o2oSaleBonus;
	}

	public BigDecimal getO2oJF() {
		return o2oJF;
	}

	public void setO2oJF(BigDecimal o2oJF) {
		this.o2oJF = o2oJF;
	}

	public BigDecimal getBonusDis() {
		return bonusDis;
	}

	public void setBonusDis(BigDecimal bonusDis) {
		this.bonusDis = bonusDis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BigDecimal getNextBonus() {
		return nextBonus;
	}

	public void setNextBonus(BigDecimal nextBonus) {
		this.nextBonus = nextBonus;
	}
	
	
}
