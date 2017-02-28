
package com.chlitina.o2o.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAccountBalanceDetailResponse", namespace = "http://ws.o2o.chlitina.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountBalanceDetailResponse", namespace = "http://ws.o2o.chlitina.com/")
public class GetAccountBalanceDetailResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.chlitina.o2o.entity.AccountBalanceDetail> _return;

    /**
     * 
     * @return
     *     returns List<AccountBalanceDetail>
     */
    public List<com.chlitina.o2o.entity.AccountBalanceDetail> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.chlitina.o2o.entity.AccountBalanceDetail> _return) {
        this._return = _return;
    }

}
