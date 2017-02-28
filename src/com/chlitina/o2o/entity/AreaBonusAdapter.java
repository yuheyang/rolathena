package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.AreaBonusImpl;

public class AreaBonusAdapter extends XmlAdapter<AreaBonusImpl, AreaBonus> {

	@Override
	public AreaBonusImpl marshal(AreaBonus areabonus) throws Exception {
		if(areabonus instanceof AreaBonusImpl){
			return (AreaBonusImpl)areabonus;
		}else{
			return new AreaBonusImpl();
		}
	}

	@Override
	public AreaBonus unmarshal(AreaBonusImpl bonus) throws Exception {
		return bonus;
	}

}
