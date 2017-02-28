package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.ProductReportImpl;

public class ProductReportAdapter extends XmlAdapter<ProductReportImpl, ProductReport> {

	@Override
	public ProductReportImpl marshal(ProductReport report) throws Exception {
		if(report instanceof ProductReportImpl){
			return (ProductReportImpl)report;
		}else{
			return new ProductReportImpl();
		}
	}

	@Override
	public ProductReport unmarshal(ProductReportImpl report) throws Exception {
		return report;
	}

}
