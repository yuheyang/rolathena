package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.MaterialMasterImpl;

public class MaterialMasterAdapter extends XmlAdapter<MaterialMasterImpl, MaterialMaster>{

	@Override
	public MaterialMasterImpl marshal(MaterialMaster master) throws Exception {
		if(master instanceof MaterialMasterImpl) {
			return (MaterialMasterImpl)master;
		}
		return new MaterialMasterImpl();
	}

	@Override
	public MaterialMaster unmarshal(MaterialMasterImpl master) throws Exception {
		return master;
	}

}
