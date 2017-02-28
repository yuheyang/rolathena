package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.FranchiseStore;

@XmlType(name= "FranchiseStore")
public class FranchiseStoreImpl implements FranchiseStore {
	private String KUNNR;	//客户编号
	private String BFLAG;	//'X'代表完成首购 空白为否
	private String STATUS;
	private String MESSAGE;
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#getKUNNR()
	 */
	@Override
	public String getKUNNR() {
		return KUNNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#setKUNNR(java.lang.String)
	 */
	@Override
	public void setKUNNR(String kUNNR) {
		KUNNR = kUNNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#getBFLAG()
	 */
	@Override
	public String getBFLAG() {
		return BFLAG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#setBFLAG(java.lang.String)
	 */
	@Override
	public void setBFLAG(String bFLAG) {
		BFLAG = bFLAG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#getSTATUS()
	 */
	@Override
	public String getSTATUS() {
		return STATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#setSTATUS(java.lang.String)
	 */
	@Override
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#getMESSAGE()
	 */
	@Override
	public String getMESSAGE() {
		return MESSAGE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.FranchiseStore#setMESSAGE(java.lang.String)
	 */
	@Override
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}

	
}
