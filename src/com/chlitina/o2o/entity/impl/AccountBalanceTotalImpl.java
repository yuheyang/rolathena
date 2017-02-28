package com.chlitina.o2o.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.chlitina.o2o.common.MapAdapter;
import com.chlitina.o2o.entity.AccountBalanceTotal;
import com.chlitina.o2o.entity.BalanceRecorder;
import com.chlitina.o2o.entity.BalanceRecorderAdapter;

@XmlRootElement
@XmlType(name="AccountBalanceTotal")
public class AccountBalanceTotalImpl implements AccountBalanceTotal {
	private String KKBER;	//信贷控制范围
	private String KUNNR;	//加盟店编号 
	private String SERNO;	//序号
	private String SAREA;	//销售地区 
	private String ORT01;	//市名称 
	private String NAME1;	//客户-Name1
	private String NAME2;	//客户-Name2
	private String OBLIG;	//虚拟账户余额
	private List<BalanceRecorder> recorderList;
	private Map<String, String> DMBTRMap;	//暂收货款余额
	private String WAERS;	//本币币別
	
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getKKBER()
	 */
	@Override
	public String getKKBER() {
		return KKBER;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setKKBER(java.lang.String)
	 */
	@Override
	public void setKKBER(String kKBER) {
		KKBER = kKBER;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getKUNNR()
	 */
	@Override
	public String getKUNNR() {
		return KUNNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setKUNNR(java.lang.String)
	 */
	@Override
	public void setKUNNR(String kUNNR) {
		KUNNR = kUNNR;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getSERNO()
	 */
	@Override
	public String getSERNO() {
		return SERNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setSERNO(java.lang.String)
	 */
	@Override
	public void setSERNO(String sERNO) {
		SERNO = sERNO;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getSAREA()
	 */
	@Override
	public String getSAREA() {
		return SAREA;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setSAREA(java.lang.String)
	 */
	@Override
	public void setSAREA(String sAREA) {
		SAREA = sAREA;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getORT01()
	 */
	@Override
	public String getORT01() {
		return ORT01;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setORT01(java.lang.String)
	 */
	@Override
	public void setORT01(String oRT01) {
		ORT01 = oRT01;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getNAME1()
	 */
	@Override
	public String getNAME1() {
		return NAME1;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setNAME1(java.lang.String)
	 */
	@Override
	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getNAME2()
	 */
	@Override
	public String getNAME2() {
		return NAME2;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setNAME2(java.lang.String)
	 */
	@Override
	public void setNAME2(String nAME2) {
		NAME2 = nAME2;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getOBLIG()
	 */
	@Override
	public String getOBLIG() {
		return OBLIG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setOBLIG(java.lang.String)
	 */
	@Override
	public void setOBLIG(String oBLIG) {
		OBLIG = oBLIG;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getDMBTRMap()
	 */
	@Override
	@XmlJavaTypeAdapter(MapAdapter.class)
	public Map<String, String> getDMBTRMap() {
		return DMBTRMap;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setDMBTRList(java.util.Map)
	 */
	@Override
	public void setDMBTRList(Map<String, String>  dMBTRMap) {
		DMBTRMap = dMBTRMap;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#getWAERS()
	 */
	@Override
	public String getWAERS() {
		return WAERS;
	}
	/* (non-Javadoc)
	 * @see com.chlitina.o2o.entity.impl.AccountBalanceTotal#setWAERS(java.lang.String)
	 */
	@Override
	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}

	@Override
	public List<BalanceRecorder> getRecorderList() {
		return recorderList;
	}
	
	@Override
	public void setRecorderList(List<BalanceRecorder> recorderList) {
		this.recorderList = recorderList;
	}

}
