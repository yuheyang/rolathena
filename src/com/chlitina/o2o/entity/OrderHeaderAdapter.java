package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.OrderHeaderImpl;

public class OrderHeaderAdapter extends XmlAdapter<OrderHeaderImpl, OrderHeader>{

	@Override
	public OrderHeaderImpl marshal(OrderHeader order) throws Exception {
		if(order instanceof OrderHeaderImpl){
			return (OrderHeaderImpl)order;
		}
		return new OrderHeaderImpl();
	}

	@Override
	public OrderHeader unmarshal(OrderHeaderImpl order) throws Exception {
		return order;
	}

}
