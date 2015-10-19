package com.vvirlan;
import javax.xml.ws.WebServiceRef;

import com.vvirlan.HelloEjb;

public class ClientClass {

	@WebServiceRef(wsdlLocation="https://en32319:8181/HelloEjbService/HelloEjb?wsdl")
	private static HelloEjb service;
	
	public static void main(String[] args) {
		service.hello("Vlad");
	}
}
