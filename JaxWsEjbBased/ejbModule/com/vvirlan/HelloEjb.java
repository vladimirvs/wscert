package com.vvirlan;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@Stateless
@WebService
public class HelloEjb {

	@Resource WebServiceContext wsContext;
	public String hello(String msg) {
		return "EJB WS: " + wsContext.getUserPrincipal()+": "+ msg;
	}
 }
