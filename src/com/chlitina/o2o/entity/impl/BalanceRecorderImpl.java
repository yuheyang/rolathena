package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.BalanceRecorder;

@XmlType(name="BalanceRecorder")
public class BalanceRecorderImpl implements BalanceRecorder {
	private String ID;
	private String DES;
	private String DMBTR;
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.BalanceRecorder#getID()
	 */
	@Override
	public String getID() {
		return ID;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.BalanceRecorder#setID(java.lang.String)
	 */
	@Override
	public void setID(String iD) {
		ID = iD;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.BalanceRecorder#getDES()
	 */
	@Override
	public String getDES() {
		return DES;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.BalanceRecorder#setDES(java.lang.String)
	 */
	@Override
	public void setDES(String dES) {
		DES = dES;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.BalanceRecorder#getDMBTR()
	 */
	@Override
	public String getDMBTR() {
		return DMBTR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.BalanceRecorder#setDMBTR(java.lang.String)
	 */
	@Override
	public void setDMBTR(String dMBTR) {
		DMBTR = dMBTR;
	}
	
	
}
