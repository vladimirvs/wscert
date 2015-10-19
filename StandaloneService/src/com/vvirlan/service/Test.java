package com.vvirlan.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Test {

	@WebMethod
	public String sayHello(){
		return "Hello!";
	}
}
