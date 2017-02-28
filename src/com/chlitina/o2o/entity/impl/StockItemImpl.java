package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.StockItem;

@XmlType(name = "StockItem")
public class StockItemImpl implements StockItem {
	private String PLANT;
	private String LOCATION;
	private String MATERIAL;
	private String UNIT;
	private String REQ_QTY;
	private String RET_STATUS;
	private String INCOM_QTY;
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getPLANT()
	 */
	@Override
	public String getPLANT() {
		return PLANT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setPLANT(java.lang.String)
	 */
	@Override
	public void setPLANT(String pLANT) {
		PLANT = pLANT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getLOCATION()
	 */
	@Override
	public String getLOCATION() {
		return LOCATION;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setLOCATION(java.lang.String)
	 */
	@Override
	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getMATERIAL()
	 */
	@Override
	public String getMATERIAL() {
		return MATERIAL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setMATERIAL(java.lang.String)
	 */
	@Override
	public void setMATERIAL(String mATERIAL) {
		MATERIAL = mATERIAL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getUNIT()
	 */
	@Override
	public String getUNIT() {
		return UNIT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setUNIT(java.lang.String)
	 */
	@Override
	public void setUNIT(String uNIT) {
		UNIT = uNIT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getREQ_QTY()
	 */
	@Override
	public String getREQ_QTY() {
		return REQ_QTY;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setREQ_QTY(java.lang.String)
	 */
	@Override
	public void setREQ_QTY(String rEQ_QTY) {
		REQ_QTY = rEQ_QTY;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getRET_STATUS()
	 */
	@Override
	public String getRET_STATUS() {
		return RET_STATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setRET_STATUS(java.lang.String)
	 */
	@Override
	public void setRET_STATUS(String rET_STATUS) {
		RET_STATUS = rET_STATUS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#getINCOM_QTY()
	 */
	@Override
	public String getINCOM_QTY() {
		return INCOM_QTY;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.StockItem#setINCOM_QTY(java.lang.String)
	 */
	@Override
	public void setINCOM_QTY(String iNCOM_QTY) {
		INCOM_QTY = iNCOM_QTY;
	}

	
}
