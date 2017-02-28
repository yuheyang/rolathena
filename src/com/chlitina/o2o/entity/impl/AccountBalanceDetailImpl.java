package com.chlitina.o2o.entity.impl;

import org.apache.cxf.aegis.type.java5.XmlType;

import com.chlitina.o2o.entity.AccountBalanceDetail;

@XmlType(name="AccountBalanceDetail")
public class AccountBalanceDetailImpl implements AccountBalanceDetail { 
	private String KKBER;	//�������Ʒ�Χ
	private String KUNNR;	//�ͻ����
	private String SERNO;	//���
	private String NAME1;	//�ͻ�-Name1
	private String NAME2;	//�ͻ�-Name2
	private String ORAMT;	//ԭ�ʻ���� 
	private String IOAMT;	//��(��)�˽�� 
	private String TOTAL;	//���ʻ���� 
	private String WAERS;	//���ұ҄e
	private String BUDAT;	//����
	private String DOCNO;	//���ݺ� 
	private String VKBUR;	//�Ƶ��������
	private String REMARK;	//��ע
	private String UNAME;	//�Ƶ��� 
	private String OBLIG;	//�Ŵ������ܶ�
	private String SKFOR;	//Ӧ���ܶ�
	private String SSOBL;	//�ر�����ծ��
	private String SAUFT;	//����ֵ 
	private String BEZEI;	//�Ƶ�����
	private String TIME;	//ʱ��
	private String SOURCE;	//����Դ 
	private String TYPE;    //��������
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getKKBER()
	 */
	@Override
	public String getKKBER() {
		return KKBER;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setKKBER(java.lang.String)
	 */
	@Override
	public void setKKBER(String kKBER) {
		KKBER = kKBER;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getKUNNR()
	 */
	@Override
	public String getKUNNR() {
		return KUNNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setKUNNR(java.lang.String)
	 */
	@Override
	public void setKUNNR(String kUNNR) {
		KUNNR = kUNNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getSERNO()
	 */
	@Override
	public String getSERNO() {
		return SERNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setSERNO(java.lang.String)
	 */
	@Override
	public void setSERNO(String sERNO) {
		SERNO = sERNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getNAME1()
	 */
	@Override
	public String getNAME1() {
		return NAME1;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setNAME1(java.lang.String)
	 */
	@Override
	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getNAME2()
	 */
	@Override
	public String getNAME2() {
		return NAME2;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setNAME2(java.lang.String)
	 */
	@Override
	public void setNAME2(String nAME2) {
		NAME2 = nAME2;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getORAMT()
	 */
	@Override
	public String getORAMT() {
		return ORAMT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setORAMT(java.lang.String)
	 */
	@Override
	public void setORAMT(String oRAMT) {
		ORAMT = oRAMT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getIOAMT()
	 */
	@Override
	public String getIOAMT() {
		return IOAMT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setIOAMT(java.lang.String)
	 */
	@Override
	public void setIOAMT(String iOAMT) {
		IOAMT = iOAMT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getTOTAL()
	 */
	@Override
	public String getTOTAL() {
		return TOTAL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setTOTAL(java.lang.String)
	 */
	@Override
	public void setTOTAL(String tOTAL) {
		TOTAL = tOTAL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getWAERS()
	 */
	@Override
	public String getWAERS() {
		return WAERS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setWAERS(java.lang.String)
	 */
	@Override
	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getBUDAT()
	 */
	@Override
	public String getBUDAT() {
		return BUDAT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setBUDAT(java.lang.String)
	 */
	@Override
	public void setBUDAT(String bUDAT) {
		BUDAT = bUDAT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getDOCNO()
	 */
	@Override
	public String getDOCNO() {
		return DOCNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setDOCNO(java.lang.String)
	 */
	@Override
	public void setDOCNO(String dOCNO) {
		DOCNO = dOCNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getVKBUR()
	 */
	@Override
	public String getVKBUR() {
		return VKBUR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setVKBUR(java.lang.String)
	 */
	@Override
	public void setVKBUR(String vKBUR) {
		VKBUR = vKBUR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getREMARK()
	 */
	@Override
	public String getREMARK() {
		return REMARK;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setREMARK(java.lang.String)
	 */
	@Override
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getUNAME()
	 */
	@Override
	public String getUNAME() {
		return UNAME;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setUNAME(java.lang.String)
	 */
	@Override
	public void setUNAME(String uNAME) {
		UNAME = uNAME;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getOBLIG()
	 */
	@Override
	public String getOBLIG() {
		return OBLIG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setOBLIG(java.lang.String)
	 */
	@Override
	public void setOBLIG(String oBLIG) {
		OBLIG = oBLIG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getSKFOR()
	 */
	@Override
	public String getSKFOR() {
		return SKFOR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setSKFOR(java.lang.String)
	 */
	@Override
	public void setSKFOR(String sKFOR) {
		SKFOR = sKFOR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getSSOBL()
	 */
	@Override
	public String getSSOBL() {
		return SSOBL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setSSOBL(java.lang.String)
	 */
	@Override
	public void setSSOBL(String sSOBL) {
		SSOBL = sSOBL;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getSAUFT()
	 */
	@Override
	public String getSAUFT() {
		return SAUFT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setSAUFT(java.lang.String)
	 */
	@Override
	public void setSAUFT(String sAUFT) {
		SAUFT = sAUFT;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getBEZEI()
	 */
	@Override
	public String getBEZEI() {
		return BEZEI;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setBEZEI(java.lang.String)
	 */
	@Override
	public void setBEZEI(String bEZEI) {
		BEZEI = bEZEI;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getTIME()
	 */
	@Override
	public String getTIME() {
		return TIME;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setTIME(java.lang.String)
	 */
	@Override
	public void setTIME(String tIME) {
		TIME = tIME;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#getSOURCE()
	 */
	@Override
	public String getSOURCE() {
		return SOURCE;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceDetail#setSOURCE(java.lang.String)
	 */
	@Override
	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}


}
