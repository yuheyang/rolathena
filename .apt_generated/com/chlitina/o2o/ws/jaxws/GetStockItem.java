
package com.chlitina.o2o.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getStockItem", namespace = "http://ws.o2o.chlitina.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStockItem", namespace = "http://ws.o2o.chlitina.com/")
public class GetStockItem {

    @XmlElement(name = "arg0", namespace = "")
    private List<com.chlitina.o2o.entity.StockItem> arg0;

    /**
     * 
     * @return
     *     returns List<StockItem>
     */
    public List<com.chlitina.o2o.entity.StockItem> getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(List<com.chlitina.o2o.entity.StockItem> arg0) {
        this.arg0 = arg0;
    }

}
