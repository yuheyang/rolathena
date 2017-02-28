package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.StoreBonusDefineImpl;

public class StoreBonusDefineAdapter extends XmlAdapter<StoreBonusDefineImpl, StoreBonusDefine> {

	@Override
	public StoreBonusDefineImpl marshal(StoreBonusDefine define) throws Exception {
		if(define instanceof StoreBonusDefineImpl){
			return (StoreBonusDefineImpl)define;
		}
		return new StoreBonusDefineImpl();
	}

	@Override
	public StoreBonusDefine unmarshal(StoreBonusDefineImpl define)
			throws Exception {
		return define;
	}

}
