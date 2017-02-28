package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.StoreRechargeImpl;

public class StoreRechargeAdapter extends XmlAdapter<StoreRechargeImpl, StoreRecharge> {

	@Override
	public StoreRechargeImpl marshal(StoreRecharge recharge) throws Exception {
		if(recharge instanceof StoreRechargeImpl){
			return (StoreRechargeImpl)recharge;
		}else{
			return new StoreRechargeImpl();
		}
	}

	@Override
	public StoreRecharge unmarshal(StoreRechargeImpl recharge) throws Exception {
		// TODO Auto-generated method stub
		return recharge;
	}

}
