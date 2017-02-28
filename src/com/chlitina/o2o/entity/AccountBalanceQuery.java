package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(AccountBalanceQueryAdapter.class)
public interface AccountBalanceQuery {

	public String getCredit();

	public void setCredit(String credit);

	public String getBzirkstart();

	public void setBzirkstart(String bzirkstart);

	public String getBzirkend();

	public void setBzirkend(String bzirkend);

	public String getTypestart();

	public void setTypestart(String typestart);

	public String getTypeend();

	public void setTypeend(String typeend);

	public String getKunnrstart();

	public void setKunnrstart(String kunnrstart);

	public String getKunnrend();

	public void setKunnrend(String kunnrend);

	public String getDetailstart();

	public void setDetailstart(String detailstart);

	public String getDetailend();

	public void setDetailend(String detailend);

	public String getTotaldate();

	public void setTotaldate(String totaldate);

	public String getQuerytype();

	public void setQuerytype(String querytype);
	
	public void setSubtotal(String subtotal);
	
	public String getSubtotal();

}