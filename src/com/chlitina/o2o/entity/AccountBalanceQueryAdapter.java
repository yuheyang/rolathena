package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.AccountBalanceQueryImpl;

public class AccountBalanceQueryAdapter extends XmlAdapter<AccountBalanceQueryImpl, AccountBalanceQuery>{

	@Override
	public AccountBalanceQueryImpl marshal(AccountBalanceQuery query)
			throws Exception {
		if(query instanceof AccountBalanceQueryImpl){
			return (AccountBalanceQueryImpl)query;
		}else{
			return new AccountBalanceQueryImpl();
		}
		
	}

	@Override
	public AccountBalanceQuery unmarshal(AccountBalanceQueryImpl query)
			throws Exception {
		return query;
	}

}
