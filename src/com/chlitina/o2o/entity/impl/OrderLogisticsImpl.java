package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.OrderLogistics;

@XmlType(name = "OrderLogistics")
public class OrderLogisticsImpl implements OrderLogistics {
	private String GT_VBELN;
	private String STATUS;
	private String MESSAGE;
	private String YUNDA;
	private String LIFNR;
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#getGT_VBELN()
	 */
	@Override
	public String getGT_VBELN() {
		return GT_VBELN;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#setGT_VBELN(java.lang.String)
	 */
	@Override
	public void setGT_VBELN(String gT_VBELN) {
		GT_VBELN = gT_VBELN;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#getSTATUS()
	 */
	@Override
	public String getSTATUS() {
		return STATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#setSTATUS(java.lang.String)
	 */
	@Override
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#getMESSAGE()
	 */
	@Override
	public String getMESSAGE() {
		return MESSAGE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#setMESSAGE(java.lang.String)
	 */
	@Override
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#getYUNDA()
	 */
	@Override
	public String getYUNDA() {
		return YUNDA;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#setYUNDA(java.lang.String)
	 */
	@Override
	public void setYUNDA(String yUNDA) {
		YUNDA = yUNDA;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#getLIFNR()
	 */
	@Override
	public String getLIFNR() {
		return LIFNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.OrderLogistics#setLIFNR(java.lang.String)
	 */
	@Override
	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}
	
	
}
