package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.FranchiseStoreImpl;


public class FranchiseStoreAdapter  extends XmlAdapter<FranchiseStoreImpl, FranchiseStore>{

	@Override
	public FranchiseStoreImpl marshal(FranchiseStore store) throws Exception {
		if(store instanceof FranchiseStoreImpl){
			return (FranchiseStoreImpl)store;
		}
		return new FranchiseStoreImpl();
	}

	@Override
	public FranchiseStore unmarshal(FranchiseStoreImpl store) throws Exception {
		return store;
	}

}
