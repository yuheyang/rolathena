package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.SOOrderDetailImpl;
import com.chlitina.o2o.entity.impl.SOOrderDetailPromotionImpl;

public class SOOrderDetailAdapter extends XmlAdapter<SOOrderDetailImpl, SOOrderDetail>{

	@Override
	public SOOrderDetailImpl marshal(SOOrderDetail detail) throws Exception {
		if (detail instanceof SOOrderDetailImpl) {
            return (SOOrderDetailImpl)detail;
        }
        return new SOOrderDetailImpl();
	}

	@Override
	public SOOrderDetail unmarshal(SOOrderDetailImpl detail) throws Exception {
		// TODO Auto-generated method stub
		return detail;
	}

}
