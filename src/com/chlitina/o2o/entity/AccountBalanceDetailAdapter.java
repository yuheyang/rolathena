package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.AccountBalanceDetailImpl;

public class AccountBalanceDetailAdapter extends
		XmlAdapter<AccountBalanceDetailImpl, AccountBalanceDetail> {

	@Override
	public AccountBalanceDetailImpl marshal(AccountBalanceDetail detail) throws Exception {
		if(detail instanceof AccountBalanceDetailImpl){
			return (AccountBalanceDetailImpl)detail;
		}else{
			return new AccountBalanceDetailImpl();
		}
	}

	@Override
	public AccountBalanceDetail unmarshal(AccountBalanceDetailImpl di) throws Exception {
		return di;
	}

}
