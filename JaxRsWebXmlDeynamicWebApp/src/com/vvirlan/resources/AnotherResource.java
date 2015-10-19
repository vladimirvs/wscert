package com.vvirlan.resources;

import javax.ws.rs.GET;

public class AnotherResource {

	@GET
	public String sayHelo() {
		return "HELLO FROM ANOTHER RESOURCE";
	}
}
