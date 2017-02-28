package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.StoreRechargeResult;

@XmlType(name="StoreRechargeResult")
public class StoreRechargeResultImpl implements StoreRechargeResult {
	private String IBXNO;
	private String TYPE;
	private String BELNR;
	private String GJAHR;
	private String BUKRS;
	private String ERRMSG;
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#getIBXNO()
	 */
	@Override
	public String getIBXNO() {
		return IBXNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#setIBXNO(java.lang.String)
	 */
	@Override
	public void setIBXNO(String iBXNO) {
		IBXNO = iBXNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#getTYPE()
	 */
	@Override
	public String getTYPE() {
		return TYPE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#setTYPE(java.lang.String)
	 */
	@Override
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#getBELNR()
	 */
	@Override
	public String getBELNR() {
		return BELNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#setBELNR(java.lang.String)
	 */
	@Override
	public void setBELNR(String bELNR) {
		BELNR = bELNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#getGJAHR()
	 */
	@Override
	public String getGJAHR() {
		return GJAHR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#setGJAHR(java.lang.String)
	 */
	@Override
	public void setGJAHR(String gJAHR) {
		GJAHR = gJAHR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#getBUKRS()
	 */
	@Override
	public String getBUKRS() {
		return BUKRS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#setBUKRS(java.lang.String)
	 */
	@Override
	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#getERRMSG()
	 */
	@Override
	public String getERRMSG() {
		return ERRMSG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StoreRechargeResult#setERRMSG(java.lang.String)
	 */
	@Override
	public void setERRMSG(String eRRMSG) {
		ERRMSG = eRRMSG;
	}
	
	
}
