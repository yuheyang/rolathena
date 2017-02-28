package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.StoreMonBonusImpl;

public class StoreMonBonusAdapter extends XmlAdapter<StoreMonBonusImpl, StoreMonBonus>{

	@Override
	public StoreMonBonusImpl marshal(StoreMonBonus bonus) throws Exception {
		if(bonus instanceof StoreMonBonusImpl){
			return (StoreMonBonusImpl)bonus;
		}
		return new StoreMonBonusImpl();
	}

	@Override
	public StoreMonBonus unmarshal(StoreMonBonusImpl bonus) throws Exception {
		return bonus;
	}

}
