package com.vvirlan.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class MyResource {

	@GET
	public String sayHello() {
		return "Hi there";
	}
}
