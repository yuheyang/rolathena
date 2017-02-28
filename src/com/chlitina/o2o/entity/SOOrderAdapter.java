package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.SOOrderImpl;

public class SOOrderAdapter extends XmlAdapter<SOOrderImpl, SOOrder>{

	@Override
	public SOOrderImpl marshal(SOOrder soorder) throws Exception {
		if (soorder instanceof SOOrderImpl) {
            return (SOOrderImpl)soorder;
        }
        return new SOOrderImpl();
	}

	@Override
	public SOOrder unmarshal(SOOrderImpl soorder) throws Exception {
		// TODO Auto-generated method stub
		return soorder;
	}

}
