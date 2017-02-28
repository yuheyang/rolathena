package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.OrderHeaderMonImpl;

public class OrderHeaderMonAdapter extends XmlAdapter<OrderHeaderMonImpl, OrderHeaderMon> {

	@Override
	public OrderHeaderMonImpl marshal(OrderHeaderMon order) throws Exception {
		if(order instanceof OrderHeaderMonImpl){
			return (OrderHeaderMonImpl)order;
		}
		return new OrderHeaderMonImpl();
	}

	@Override
	public OrderHeaderMon unmarshal(OrderHeaderMonImpl order) throws Exception {
		return order;
	}

}
