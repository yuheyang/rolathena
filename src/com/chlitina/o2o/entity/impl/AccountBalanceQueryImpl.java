package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.AccountBalanceQuery;

/**
 * @author Administrator
 *
 */
@XmlType(name="AccountBalanceQuery")
public class AccountBalanceQueryImpl implements AccountBalanceQuery {
	private String credit;
	private String bzirkstart;
	private String bzirkend;
	private String typestart;
	private String typeend;
	private String kunnrstart;
	private String kunnrend;
	private String detailstart;
	private String detailend;
	private String totaldate;
	private String querytype;
	private String subtotal;
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getCredit()
	 */
	@Override
	public String getCredit() {
		return credit;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setCredit(java.lang.String)
	 */
	@Override
	public void setCredit(String credit) {
		this.credit = credit;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getBzirkstart()
	 */
	@Override
	public String getBzirkstart() {
		return bzirkstart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setBzirkstart(java.lang.String)
	 */
	@Override
	public void setBzirkstart(String bzirkstart) {
		this.bzirkstart = bzirkstart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getBzirkend()
	 */
	@Override
	public String getBzirkend() {
		return bzirkend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setBzirkend(java.lang.String)
	 */
	@Override
	public void setBzirkend(String bzirkend) {
		this.bzirkend = bzirkend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getTypestart()
	 */
	@Override
	public String getTypestart() {
		return typestart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setTypestart(java.lang.String)
	 */
	@Override
	public void setTypestart(String typestart) {
		this.typestart = typestart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getTypeend()
	 */
	@Override
	public String getTypeend() {
		return typeend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setTypeend(java.lang.String)
	 */
	@Override
	public void setTypeend(String typeend) {
		this.typeend = typeend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getKunnrstart()
	 */
	@Override
	public String getKunnrstart() {
		return kunnrstart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setKunnrstart(java.lang.String)
	 */
	@Override
	public void setKunnrstart(String kunnrstart) {
		this.kunnrstart = kunnrstart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getKunnrend()
	 */
	@Override
	public String getKunnrend() {
		return kunnrend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setKunnrend(java.lang.String)
	 */
	@Override
	public void setKunnrend(String kunnrend) {
		this.kunnrend = kunnrend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getDetailstart()
	 */
	@Override
	public String getDetailstart() {
		return detailstart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setDetailstart(java.lang.String)
	 */
	@Override
	public void setDetailstart(String detailstart) {
		this.detailstart = detailstart;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getDetailend()
	 */
	@Override
	public String getDetailend() {
		return detailend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setDetailend(java.lang.String)
	 */
	@Override
	public void setDetailend(String detailend) {
		this.detailend = detailend;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getTotaldate()
	 */
	@Override
	public String getTotaldate() {
		return totaldate;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setTotaldate(java.lang.String)
	 */
	@Override
	public void setTotaldate(String totaldate) {
		this.totaldate = totaldate;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#getQuerytype()
	 */
	@Override
	public String getQuerytype() {
		return querytype;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceQuery#setQuerytype(java.lang.String)
	 */
	@Override
	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}
	
	public void setSubtotal(String subtotal){
		this.subtotal = subtotal;
	}
	
	public String getSubtotal(){
		return this.subtotal;
	}
}
