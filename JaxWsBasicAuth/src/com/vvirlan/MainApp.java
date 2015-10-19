package com.vvirlan;

import javax.annotation.security.RolesAllowed;
import javax.jws.WebService;

@WebService
public class MainApp {

	@RolesAllowed("USER")
	public String sayHello() {
		return "Hello";
	}

}
