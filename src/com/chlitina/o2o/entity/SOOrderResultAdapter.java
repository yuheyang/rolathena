package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.SOOrderResultImpl;

public class SOOrderResultAdapter extends XmlAdapter<SOOrderResultImpl, SOOrderResult>{

	@Override
	public SOOrderResultImpl marshal(SOOrderResult result) throws Exception {
		if (result instanceof SOOrderResultImpl) {
            return (SOOrderResultImpl)result;
        }
        return new SOOrderResultImpl();
	}

	@Override
	public SOOrderResult unmarshal(SOOrderResultImpl result) throws Exception {
		return result;
	}

}
