package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.BalanceRecorderImpl;

public class BalanceRecorderAdapter extends XmlAdapter<BalanceRecorderImpl, BalanceRecorder> {

	@Override
	public BalanceRecorderImpl marshal(BalanceRecorder rec) throws Exception {
		if(rec instanceof BalanceRecorderImpl) {
			return (BalanceRecorderImpl)rec;
		}else{
			return new BalanceRecorderImpl();
		}
	}

	@Override
	public BalanceRecorder unmarshal(BalanceRecorderImpl rec) throws Exception {
		return rec;
	}

}
