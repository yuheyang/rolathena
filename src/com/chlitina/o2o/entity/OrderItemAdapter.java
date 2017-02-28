package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.OrderItemImpl;

public class OrderItemAdapter extends XmlAdapter<OrderItemImpl, OrderItem> {

	@Override
	public OrderItemImpl marshal(OrderItem item) throws Exception {
		if(item instanceof OrderItemImpl) {
			return (OrderItemImpl)item;
		}
		return new OrderItemImpl();
	}

	@Override
	public OrderItem unmarshal(OrderItemImpl item) throws Exception {
		return item;
	}

}
