package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.StoreMonBonusSecImpl;

public class StoreMonBonusSecAdapter extends XmlAdapter<StoreMonBonusSecImpl, StoreMonBonusSec> {

	@Override
	public StoreMonBonusSecImpl marshal(StoreMonBonusSec bonus) throws Exception {
		if(bonus instanceof StoreMonBonusSecImpl){
			return (StoreMonBonusSecImpl)bonus;
		}
		return new StoreMonBonusSecImpl();
	}

	@Override
	public StoreMonBonusSec unmarshal(StoreMonBonusSecImpl bonus)
			throws Exception {
		return bonus;
	}

}
