package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(CustMasterAdapter.class)
public interface CustMaster {

	public String getKunnr();

	public void setKunnr(String kunnr);

	public String getAreaName();

	public void setAreaName(String areaName);

	public String getBank();

	public void setBank(String bank);

	public String getBankNo();

	public void setBankNo(String bankNo);

	public String getBnId();

	public void setBnId(String bnId);

	public String getBzirk();

	public void setBzirk(String bzirk);

	public String getBztxt();

	public void setBztxt(String bztxt);

	public String getCancelDate();

	public void setCancelDate(String cancelDate);

	public String getCdate();

	public void setCdate(String cdate);

	public String getCityCode();

	public void setCityCode(String cityCode);

	public String getCityName();

	public void setCityName(String cityName);

	public String getCoBank();

	public void setCoBank(String coBank);

	public String getCoBankNo();

	public void setCoBankNo(String coBankNo);

	public String getConsultDate();

	public void setConsultDate(String consultDate);

	public String getConsultFee();

	public void setConsultFee(String consultFee);

	public String getConsultName();

	public void setConsultName(String consultName);

	public String getCorpDeputy();

	public void setCorpDeputy(String corpDeputy);

	public String getCorpDeputyId();

	public void setCorpDeputyId(String corpDeputyId);

	public String getCorpName();

	public void setCorpName(String corpName);

	public String getCustAdd002();

	public void setCustAdd002(String custAdd002);

	public String getCustAdd003();

	public void setCustAdd003(String custAdd003);

	public String getCustAdd039();

	public void setCustAdd039(String custAdd039);

	public String getCustAdd040();

	public void setCustAdd040(String custAdd040);

	public String getCustLevel();

	public void setCustLevel(String custLevel);

	public String getCustTypeCode();

	public void setCustTypeCode(String custTypeCode);

	public String getCustTypeDes();

	public void setCustTypeDes(String custTypeDes);

	public double getFieldTrainQuata();

	public void setFieldTrainQuata(double fieldTrainQuata);

	public double getFreeTrainQuata();

	public void setFreeTrainQuata(double freeTrainQuata);

	public String getFreezeDate();

	public void setFreezeDate(String freezeDate);

	public String getJmDate();

	public void setJmDate(String jmDate);

	public String getJoinDate();

	public void setJoinDate(String joinDate);

	public String getKAddr();

	public void setKAddr(String kAddr);

	public String getKAddrPost();

	public void setKAddrPost(String kAddrPost);

	public String getKkber();

	public void setKkber(String kkber);

	public String getKunn21();

	public void setKunn21(String kunn21);

	public String getKunn22();

	public void setKunn22(String kunn22);

	public String getLevelupDate();

	public void setLevelupDate(String levelupDate);

	public String getLoevm();

	public void setLoevm(String loevm);

	public String getMemberType();

	public void setMemberType(String memberType);

	public String getMobileTel();

	public void setMobileTel(String mobileTel);

	public String getName1();

	public void setName1(String name1);

	public String getName11();

	public void setName11(String name11);

	public String getName12();

	public void setName12(String name12);

	public String getRdDate();

	public void setRdDate(String rdDate);

	public String getReadFlag();

	public void setReadFlag(String readFlag);

	public String getRegionCode();

	public void setRegionCode(String regionCode);

	public String getRegionName();

	public void setRegionName(String regionName);

	public double getSailTrainQuata();

	public void setSailTrainQuata(double sailTrainQuata);

	public String getSex();

	public void setSex(String sex);

	public String getShipToParty();

	public void setShipToParty(String shipToParty);

	public String getSmDate();

	public void setSmDate(String smDate);

	public String getSmtpAddr();

	public void setSmtpAddr(String smtpAddr);

	public String getSupervise();

	public void setSupervise(String supervise);

	public String getSuperviseCode();

	public void setSuperviseCode(String superviseCode);

	public String getTelf1();

	public void setTelf1(String telf1);

	public String getTelfx();

	public void setTelfx(String telfx);

	public String getTopCommend();

	public void setTopCommend(String topCommend);

	public String getTopCommendId();

	public void setTopCommendId(String topCommendId);

	public String getAreaCode();

	public void setAreaCode(String areaCode);

	public String getkAddr();

	public void setkAddr(String kAddr);

	public String getkAddrPost();

	public void setkAddrPost(String kAddrPost);
	
	public String getAdDate();

	public void setAdDate(String adDate);
}