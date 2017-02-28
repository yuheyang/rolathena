package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.AccountBalanceTotalImpl;


public class AccountBalanceTotalAdapter extends XmlAdapter<AccountBalanceTotalImpl, AccountBalanceTotal>{

	@Override
	public AccountBalanceTotalImpl marshal(AccountBalanceTotal total)
			throws Exception {
		if(total instanceof AccountBalanceTotalImpl){
			return (AccountBalanceTotalImpl)total;
		}else{
			return new AccountBalanceTotalImpl();
		}
		
	}

	@Override
	public AccountBalanceTotal unmarshal(AccountBalanceTotalImpl total)
			throws Exception {
		return total;
	}

}
