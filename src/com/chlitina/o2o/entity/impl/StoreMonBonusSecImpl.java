package com.chlitina.o2o.entity.impl;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.StoreMonBonusSec;

@XmlType(name= "StoreMonBonusSec")
public class StoreMonBonusSecImpl implements StoreMonBonusSec {
	private static final long serialVersionUID = 1L;

	private BigDecimal dnMoney;

	private BigDecimal memberBonus;

	private String memberId;

	private String period;


	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#getDnMoney()
	 */
	@Override
	public BigDecimal getDnMoney() {
		return this.dnMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#setDnMoney(java.math.BigDecimal)
	 */
	@Override
	public void setDnMoney(BigDecimal dnMoney) {
		this.dnMoney = dnMoney;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#getMemberBonus()
	 */
	@Override
	public BigDecimal getMemberBonus() {
		return this.memberBonus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#setMemberBonus(java.math.BigDecimal)
	 */
	@Override
	public void setMemberBonus(BigDecimal memberBonus) {
		this.memberBonus = memberBonus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#getMemberId()
	 */
	@Override
	public String getMemberId() {
		return this.memberId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#setMemberId(java.lang.String)
	 */
	@Override
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#getPeriod()
	 */
	@Override
	public String getPeriod() {
		return this.period;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreMonBonusSec#setPeriod(java.lang.String)
	 */
	@Override
	public void setPeriod(String period) {
		this.period = period;
	}
}
