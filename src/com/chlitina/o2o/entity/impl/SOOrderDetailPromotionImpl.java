package com.chlitina.o2o.entity.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.chlitina.o2o.entity.SOOrderDetailPromotion;

@XmlType(name = "SOOrderPromotion")
public class SOOrderDetailPromotionImpl implements SOOrderDetailPromotion {
	private String MATNR;//���Ϻ� 
	private String ARKTX;//���۶�����Ŀ���ı�
	private String KWMENG;//����
	private String ZZAFAMT;//�ۿۺ��� 
	private String ZZBVVALUE;//BVֵ 
	private String ISPRESENT;//�Ƿ���Ʒ
	private String ERDAT;//��¼�Ĵ������� 
	private String VRKME;//������λ
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getMATNR()
	 */
	@Override
	public String getMATNR() {
		return MATNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setMATNR(java.lang.String)
	 */
	@Override
	public void setMATNR(String mATNR) {
		MATNR = mATNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getARKTX()
	 */
	@Override
	public String getARKTX() {
		return ARKTX;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setARKTX(java.lang.String)
	 */
	@Override
	public void setARKTX(String aRKTX) {
		ARKTX = aRKTX;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getKWMENG()
	 */
	@Override
	public String getKWMENG() {
		return KWMENG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setKWMENG(java.lang.String)
	 */
	@Override
	public void setKWMENG(String kWMENG) {
		KWMENG = kWMENG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getZZAFAMT()
	 */
	@Override
	public String getZZAFAMT() {
		return ZZAFAMT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setZZAFAMT(java.lang.String)
	 */
	@Override
	public void setZZAFAMT(String zZAFAMT) {
		ZZAFAMT = zZAFAMT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getZZBVVALUE()
	 */
	@Override
	public String getZZBVVALUE() {
		return ZZBVVALUE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setZZBVVALUE(java.lang.String)
	 */
	@Override
	public void setZZBVVALUE(String zZBVVALUE) {
		ZZBVVALUE = zZBVVALUE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getISPRESENT()
	 */
	@Override
	public String getISPRESENT() {
		return ISPRESENT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setISPRESENT(java.lang.String)
	 */
	@Override
	public void setISPRESENT(String iSPRESENT) {
		ISPRESENT = iSPRESENT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getERDAT()
	 */
	@Override
	public String getERDAT() {
		return ERDAT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setERDAT(java.lang.String)
	 */
	@Override
	public void setERDAT(String eRDAT) {
		ERDAT = eRDAT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#getVRKME()
	 */
	@Override
	public String getVRKME() {
		return VRKME;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.SOOrderDetailPromotion#setVRKME(java.lang.String)
	 */
	@Override
	public void setVRKME(String vRKME) {
		VRKME = vRKME;
	}
	
	
}
