package com.chlitina.o2o.entity.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.SOOrder;
import com.chlitina.o2o.entity.SOOrderDetail;

@XmlType(name = "SOOrder")
public class SOOrderImpl implements SOOrder {
	private String VKORG;
	private String VTWEG;
	private String SOLD_TO;
	private String SHIP_TO;
	private String BSTKD;
	private String REMARK;
	private String CITY;
	private String STREET;
	private String VKBUR;
	private String SO_NUMBER;
	private String STATUS;
	private String MESSAGE;
	
	private List<SOOrderDetail> detailList;
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getVKORG()
	 */
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#getVKORG()
	 */
	@Override
	public String getVKORG() {
		return VKORG;
	}
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setVKORG(java.lang.String)
	 */
	@Override
	public void setVKORG(String vKORG) {
		VKORG = vKORG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getVTWEG()
	 */
	@Override
	public String getVTWEG() {
		return VTWEG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setVTWEG(java.lang.String)
	 */
	@Override
	public void setVTWEG(String vTWEG) {
		VTWEG = vTWEG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getSOLD_TO()
	 */
	@Override
	public String getSOLD_TO() {
		return SOLD_TO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setSOLD_TO(java.lang.String)
	 */
	@Override
	public void setSOLD_TO(String sOLD_TO) {
		SOLD_TO = sOLD_TO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getSHIP_TO()
	 */
	@Override
	public String getSHIP_TO() {
		return SHIP_TO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setSHIP_TO(java.lang.String)
	 */
	@Override
	public void setSHIP_TO(String sHIP_TO) {
		SHIP_TO = sHIP_TO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getBSTKD()
	 */
	@Override
	public String getBSTKD() {
		return BSTKD;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setBSTKD(java.lang.String)
	 */
	@Override
	public void setBSTKD(String bSTKD) {
		BSTKD = bSTKD;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getREMARK()
	 */
	@Override
	public String getREMARK() {
		return REMARK;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setREMARK(java.lang.String)
	 */
	@Override
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getSO_NUMBER()
	 */
	@Override
	public String getSO_NUMBER() {
		return SO_NUMBER;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setSO_NUMBER(java.lang.String)
	 */
	@Override
	public void setSO_NUMBER(String sO_NUMBER) {
		SO_NUMBER = sO_NUMBER;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getSTATUS()
	 */
	@Override
	public String getSTATUS() {
		return STATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setSTATUS(java.lang.String)
	 */
	@Override
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#getMESSAGE()
	 */
	@Override
	public String getMESSAGE() {
		return MESSAGE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.SOOrder#setMESSAGE(java.lang.String)
	 */
	@Override
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#getDetailList()
	 */
	@Override
	@XmlElementWrapper(name="detaillist")
	public List<SOOrderDetail> getDetailList() {
		return detailList;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#setDetailList(java.util.List)
	 */
	@Override
	public void setDetailList(List<SOOrderDetail> detailList) {
		this.detailList = detailList;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getSTREET() {
		return STREET;
	}

	public void setSTREET(String sTREET) {
		STREET = sTREET;
	}
	
	public void setVKBUR(String vKBUR){
		VKBUR = vKBUR;
	}
	
	public String getVKBUR(){
		return this.VKBUR;
	}
}
