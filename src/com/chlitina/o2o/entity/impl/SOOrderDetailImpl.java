package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.SOOrderDetail;

@XmlType(name = "SOOrderDetail")
public class SOOrderDetailImpl implements SOOrderDetail {
	private Integer POSNR;//销售和分销凭证的项目号
	private String MATNR;//物料号 
	private String SO_QTY;//网购数量
	private String SO_UNIT;//网购单位
	private String WERKS;//工厂
	private String LGORT;//库存地点
	private String VSTEL;//装运点/接收点 
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getPOSNR()
	 */
	@Override
	public Integer getPOSNR() {
		return POSNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setPOSNR(java.lang.Integer)
	 */
	@Override
	public void setPOSNR(Integer pOSNR) {
		POSNR = pOSNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getMATNR()
	 */
	@Override
	public String getMATNR() {
		return MATNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setMATNR(java.lang.String)
	 */
	@Override
	public void setMATNR(String mATNR) {
		MATNR = mATNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getSO_QTY()
	 */
	@Override
	public String getSO_QTY() {
		return SO_QTY;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setSO_QTY(java.lang.String)
	 */
	@Override
	public void setSO_QTY(String sO_QTY) {
		SO_QTY = sO_QTY;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getSO_UNIT()
	 */
	@Override
	public String getSO_UNIT() {
		return SO_UNIT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setSO_UNIT(java.lang.String)
	 */
	@Override
	public void setSO_UNIT(String sO_UNIT) {
		SO_UNIT = sO_UNIT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getWERKS()
	 */
	@Override
	public String getWERKS() {
		return WERKS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setWERKS(java.lang.String)
	 */
	@Override
	public void setWERKS(String wERKS) {
		WERKS = wERKS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getLGORT()
	 */
	@Override
	public String getLGORT() {
		return LGORT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setLGORT(java.lang.String)
	 */
	@Override
	public void setLGORT(String lGORT) {
		LGORT = lGORT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#getVSTEL()
	 */
	@Override
	public String getVSTEL() {
		return VSTEL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetail#setVSTEL(java.lang.String)
	 */
	@Override
	public void setVSTEL(String vSTEL) {
		VSTEL = vSTEL;
	}
	
	
	
}
