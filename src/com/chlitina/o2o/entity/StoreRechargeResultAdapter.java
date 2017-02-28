package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.StoreRechargeResultImpl;

public class StoreRechargeResultAdapter extends XmlAdapter<StoreRechargeResultImpl, StoreRechargeResult> {

	@Override
	public StoreRechargeResultImpl marshal(StoreRechargeResult result)
			throws Exception {
		if(result instanceof StoreRechargeResultImpl){
			return (StoreRechargeResultImpl)result;
		}
		return new StoreRechargeResultImpl();
	}

	@Override
	public StoreRechargeResult unmarshal(StoreRechargeResultImpl result)
			throws Exception {
		return result;
	}

}
