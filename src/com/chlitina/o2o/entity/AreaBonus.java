package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="MyAreaBonus")
@XmlJavaTypeAdapter(AreaBonusAdapter.class)
public interface AreaBonus {

	public String getBztxt();

	public void setBztxt(String bztxt);

	public String getOrt01();

	public void setOrt01(String ort01);

	public double getCucua_f();

	public void setCucua_f(double cucua_f);

	public double getCucua_t();

	public void setCucua_t(double cucua_t);

	public double getIncra();

	public void setIncra(double incra);

	public double getDesaa();

	public void setDesaa(double desaa);

	public double getCucub_f();

	public void setCucub_f(double cucub_f);

	public double getCucub_t();

	public void setCucub_t(double cucub_t);

	public double getIncrb();

	public void setIncrb(double incrb);

	public double getDesab();

	public void setDesab(double desab);

	public double getCubva();

	public void setCubva(double cubva);

	public double getCubvb();

	public void setCubvb(double cubvb);

	public double getSubab();

	public void setSubab(double subab);

	public double getPerab();

	public void setPerab(double perab);

	public double getCcbva();

	public void setCcbva(double ccbva);

	public double getCcbvb();

	public void setCcbvb(double ccbvb);

	public double getSucab();

	public void setSucab(double sucab);

	public double getPecab();

	public void setPecab(double pecab);

	public double getTxpra();

	public void setTxpra(double txpra);

	public double getTxprb();

	public void setTxprb(double txprb);

	public String getUname();

	public void setUname(String uname);

	public String getUzeit();

	public void setUzeit(String uzeit);
	
	public String getDatum();
	
	public void setDatum(String datum);
	
	public String getBzirk();
	
	public void setBzirk(String bzirk);

}