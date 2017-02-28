package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.CustMasterImpl;

public class CustMasterAdapter extends XmlAdapter<CustMasterImpl, CustMaster>{

	@Override
	public CustMasterImpl marshal(CustMaster cust) throws Exception {
		if(cust instanceof CustMasterImpl){
			return (CustMasterImpl)cust;
		}
		return new CustMasterImpl();
	}

	@Override
	public CustMaster unmarshal(CustMasterImpl cust) throws Exception {
		return cust;
	}

}
