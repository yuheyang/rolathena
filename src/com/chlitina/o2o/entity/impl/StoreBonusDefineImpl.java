package com.chlitina.o2o.entity.impl;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.StoreBonusDefine;

@XmlType(name="StoreBonusDefine")
public class StoreBonusDefineImpl implements StoreBonusDefine {
	private static final long serialVersionUID = 1L;

	private BigDecimal bonusMonth;

	private BigDecimal bonusYear;

	private String businessType;

	private String commendJmd;

	private String commendZxs;

	private BigDecimal isReal;

	private String memberType;

	private String orderCode;

	private String org;

	private BigDecimal sumJf;

	private BigDecimal sumMon;

	private BigDecimal version;

	private BigDecimal zxsBonus;

	private String zxsCode;

	private String zxsId;

	private String zxsName;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getBonusMonth()
	 */
	@Override
	public BigDecimal getBonusMonth() {
		return this.bonusMonth;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setBonusMonth(java.math.BigDecimal)
	 */
	@Override
	public void setBonusMonth(BigDecimal bonusMonth) {
		this.bonusMonth = bonusMonth;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getBonusYear()
	 */
	@Override
	public BigDecimal getBonusYear() {
		return this.bonusYear;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setBonusYear(java.math.BigDecimal)
	 */
	@Override
	public void setBonusYear(BigDecimal bonusYear) {
		this.bonusYear = bonusYear;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getBusinessType()
	 */
	@Override
	public String getBusinessType() {
		return this.businessType;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setBusinessType(java.lang.String)
	 */
	@Override
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getCommendJmd()
	 */
	@Override
	public String getCommendJmd() {
		return this.commendJmd;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setCommendJmd(java.lang.String)
	 */
	@Override
	public void setCommendJmd(String commendJmd) {
		this.commendJmd = commendJmd;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getCommendZxs()
	 */
	@Override
	public String getCommendZxs() {
		return this.commendZxs;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setCommendZxs(java.lang.String)
	 */
	@Override
	public void setCommendZxs(String commendZxs) {
		this.commendZxs = commendZxs;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getIsReal()
	 */
	@Override
	public BigDecimal getIsReal() {
		return this.isReal;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setIsReal(java.math.BigDecimal)
	 */
	@Override
	public void setIsReal(BigDecimal isReal) {
		this.isReal = isReal;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getMemberType()
	 */
	@Override
	public String getMemberType() {
		return this.memberType;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setMemberType(java.lang.String)
	 */
	@Override
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getOrderCode()
	 */
	@Override
	public String getOrderCode() {
		return this.orderCode;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setOrderCode(java.lang.String)
	 */
	@Override
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getOrg()
	 */
	@Override
	public String getOrg() {
		return this.org;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setOrg(java.lang.String)
	 */
	@Override
	public void setOrg(String org) {
		this.org = org;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getSumJf()
	 */
	@Override
	public BigDecimal getSumJf() {
		return this.sumJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setSumJf(java.math.BigDecimal)
	 */
	@Override
	public void setSumJf(BigDecimal sumJf) {
		this.sumJf = sumJf;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getSumMon()
	 */
	@Override
	public BigDecimal getSumMon() {
		return this.sumMon;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setSumMon(java.math.BigDecimal)
	 */
	@Override
	public void setSumMon(BigDecimal sumMon) {
		this.sumMon = sumMon;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getVersion()
	 */
	@Override
	public BigDecimal getVersion() {
		return this.version;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setVersion(java.math.BigDecimal)
	 */
	@Override
	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getZxsBonus()
	 */
	@Override
	public BigDecimal getZxsBonus() {
		return this.zxsBonus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setZxsBonus(java.math.BigDecimal)
	 */
	@Override
	public void setZxsBonus(BigDecimal zxsBonus) {
		this.zxsBonus = zxsBonus;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getZxsCode()
	 */
	@Override
	public String getZxsCode() {
		return this.zxsCode;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setZxsCode(java.lang.String)
	 */
	@Override
	public void setZxsCode(String zxsCode) {
		this.zxsCode = zxsCode;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getZxsId()
	 */
	@Override
	public String getZxsId() {
		return this.zxsId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setZxsId(java.lang.String)
	 */
	@Override
	public void setZxsId(String zxsId) {
		this.zxsId = zxsId;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#getZxsName()
	 */
	@Override
	public String getZxsName() {
		return this.zxsName;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreBonusDefine#setZxsName(java.lang.String)
	 */
	@Override
	public void setZxsName(String zxsName) {
		this.zxsName = zxsName;
	}
}
