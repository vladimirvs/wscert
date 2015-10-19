package com.vvirlan;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService
public class HelloServlet {
	@Resource
	WebServiceContext wsContext;

	@RolesAllowed("USER")
	public String sayHello(String msg) {
		return "Hello " + wsContext.getUserPrincipal() + " " + msg;
	}
}
