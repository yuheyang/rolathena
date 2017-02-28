package com.chlitina.o2o.sap.rfc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ICallRFC {
	
	//public boolean getLogistics(@WebParam(name = "CDN") String CDN) throws Exception;
	
	
	
}
