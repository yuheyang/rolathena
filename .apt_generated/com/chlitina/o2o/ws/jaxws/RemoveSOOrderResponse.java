
package com.chlitina.o2o.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removeSOOrderResponse", namespace = "http://ws.o2o.chlitina.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeSOOrderResponse", namespace = "http://ws.o2o.chlitina.com/")
public class RemoveSOOrderResponse {

    @XmlElement(name = "return", namespace = "")
    private com.chlitina.o2o.entity.SOOrderResult _return;

    /**
     * 
     * @return
     *     returns SOOrderResult
     */
    public com.chlitina.o2o.entity.SOOrderResult getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.chlitina.o2o.entity.SOOrderResult _return) {
        this._return = _return;
    }

}
