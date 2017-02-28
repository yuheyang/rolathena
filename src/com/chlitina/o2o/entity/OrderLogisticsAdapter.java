package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.OrderLogisticsImpl;

public class OrderLogisticsAdapter extends XmlAdapter<OrderLogisticsImpl, OrderLogistics>{

	@Override
	public OrderLogisticsImpl marshal(OrderLogistics logistics) throws Exception {
		if (logistics instanceof OrderLogisticsImpl) {
            return (OrderLogisticsImpl)logistics;
        }
        return new OrderLogisticsImpl();
	}

	@Override
	public OrderLogistics unmarshal(OrderLogisticsImpl logistics) throws Exception {
		// TODO Auto-generated method stub
		return logistics;
	}

}
