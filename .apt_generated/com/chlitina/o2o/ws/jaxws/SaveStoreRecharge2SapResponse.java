
package com.chlitina.o2o.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "saveStoreRecharge2SapResponse", namespace = "http://ws.o2o.chlitina.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveStoreRecharge2SapResponse", namespace = "http://ws.o2o.chlitina.com/")
public class SaveStoreRecharge2SapResponse {

    @XmlElement(name = "return", namespace = "")
    private com.chlitina.o2o.entity.StoreRechargeResult _return;

    /**
     * 
     * @return
     *     returns StoreRechargeResult
     */
    public com.chlitina.o2o.entity.StoreRechargeResult getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.chlitina.o2o.entity.StoreRechargeResult _return) {
        this._return = _return;
    }

}
