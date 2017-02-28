package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.OrderItemMonImpl;

public class OrderItemMonAdapter extends XmlAdapter<OrderItemMonImpl, OrderItemMon> {

	@Override
	public OrderItemMonImpl marshal(OrderItemMon item) throws Exception {
		if(item instanceof OrderItemMonImpl){
			return (OrderItemMonImpl)item;
		}
		return new OrderItemMonImpl();
	}

	@Override
	public OrderItemMon unmarshal(OrderItemMonImpl item) throws Exception {
		return item;
	}

}
