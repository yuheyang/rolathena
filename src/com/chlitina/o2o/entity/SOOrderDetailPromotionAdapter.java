package com.chlitina.o2o.entity;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.chlitina.o2o.entity.impl.SOOrderDetailPromotionImpl;

public class SOOrderDetailPromotionAdapter extends XmlAdapter<SOOrderDetailPromotionImpl, SOOrderDetailPromotion> {

	@Override
	public SOOrderDetailPromotionImpl marshal(SOOrderDetailPromotion promotion)
			throws Exception {
        if (promotion instanceof SOOrderDetailPromotionImpl) {
            return (SOOrderDetailPromotionImpl)promotion;
        }
        return new SOOrderDetailPromotionImpl();
	}

	@Override
	public SOOrderDetailPromotion unmarshal(SOOrderDetailPromotionImpl promotion)
			throws Exception {
		return promotion;
	}

}
