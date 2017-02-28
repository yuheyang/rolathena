
package com.chlitina.o2o.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAccountBalanceTotal", namespace = "http://ws.o2o.chlitina.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountBalanceTotal", namespace = "http://ws.o2o.chlitina.com/")
public class GetAccountBalanceTotal {

    @XmlElement(name = "arg0", namespace = "")
    private com.chlitina.o2o.entity.AccountBalanceQuery arg0;

    /**
     * 
     * @return
     *     returns AccountBalanceQuery
     */
    public com.chlitina.o2o.entity.AccountBalanceQuery getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.chlitina.o2o.entity.AccountBalanceQuery arg0) {
        this.arg0 = arg0;
    }

}
