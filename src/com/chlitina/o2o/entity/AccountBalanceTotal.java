package com.chlitina.o2o.entity;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.chlitina.o2o.common.MapAdapter;

@XmlRootElement(name="AccountBalanceTotal")  
@XmlJavaTypeAdapter(AccountBalanceTotalAdapter.class)

public interface AccountBalanceTotal {

	public String getKKBER();

	public void setKKBER(String kKBER);

	public String getKUNNR();

	public void setKUNNR(String kUNNR);

	public String getSERNO();

	public void setSERNO(String sERNO);

	public String getSAREA();

	public void setSAREA(String sAREA);

	public String getORT01();

	public void setORT01(String oRT01);

	public String getNAME1();

	public void setNAME1(String nAME1);

	public String getNAME2();

	public void setNAME2(String nAME2);

	public String getOBLIG();

	public void setOBLIG(String oBLIG);
	
	public Map<String, String> getDMBTRMap();
	
	public void setDMBTRList(Map<String, String> dMBTRMap);

	public String getWAERS();

	public void setWAERS(String wAERS);

	public List<BalanceRecorder> getRecorderList();
	
	public void setRecorderList(List<BalanceRecorder> recorderList);
}