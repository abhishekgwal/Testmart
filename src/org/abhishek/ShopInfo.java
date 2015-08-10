package org.abhishek;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService

/*By default, the style is set to document. We set it to RPC using SOAPBinding*/

@SOAPBinding(style= Style.RPC)
public class ShopInfo {
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property){
		String response = "Invalid Property";
		
		if("shopName".equals(property)){
			response = "Test Mart";
		}
		else if("since".equals(property)){
			return response = "since 2012";
		}
		return response;
	}
}