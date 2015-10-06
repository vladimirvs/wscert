package com.vvirlan;

import javax.annotation.security.RolesAllowed;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Main {

	@WebMethod
	@RolesAllowed("USER")
	public String sayHello() {
		return "Hello";
	}
	
	@WebMethod
	@RolesAllowed("USER")
	public String sayNothing() {
		return "";
	}
}
