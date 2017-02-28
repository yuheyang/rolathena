package com.chlitina.o2o.entity.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.SOOrderDetailPromotion;
import com.chlitina.o2o.entity.SOOrderResult;

@XmlRootElement
@XmlType(name = "SOOrderResult")
public class SOOrderResultImpl implements SOOrderResult {
	private String SO_NUMBER;
	private String STATUS;
	private String MESSAGE;
	
	private List<SOOrderDetailPromotion> list;

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#getSO_NUMBER()
	 */
	@Override
	public String getSO_NUMBER() {
		return SO_NUMBER;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#setSO_NUMBER(java.lang.String)
	 */
	@Override
	public void setSO_NUMBER(String sO_NUMBER) {
		SO_NUMBER = sO_NUMBER;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#getSTATUS()
	 */
	@Override
	public String getSTATUS() {
		return STATUS;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#setSTATUS(java.lang.String)
	 */
	@Override
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#getMESSAGE()
	 */
	@Override
	public String getMESSAGE() {
		return MESSAGE;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#setMESSAGE(java.lang.String)
	 */
	@Override
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#getList()
	 */
	@Override
	@XmlElementWrapper(name="promotionlist")
	public List<SOOrderDetailPromotion> getList() {
		return list;
	}

	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderResult#setList(java.util.List)
	 */
	@Override
	public void setList(List<SOOrderDetailPromotion> list) {
		this.list = list;
	}
	
	
}
