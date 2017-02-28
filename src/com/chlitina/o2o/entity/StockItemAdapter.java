package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.StockItemImpl;

public class StockItemAdapter extends XmlAdapter<StockItemImpl, StockItem>{

	@Override
	public StockItemImpl marshal(StockItem stock) throws Exception {
		if(stock instanceof StockItemImpl){
			return (StockItemImpl)stock;
		}
		return new StockItemImpl();
	}

	@Override
	public StockItem unmarshal(StockItemImpl stock) throws Exception {
		return stock;
	}

}
