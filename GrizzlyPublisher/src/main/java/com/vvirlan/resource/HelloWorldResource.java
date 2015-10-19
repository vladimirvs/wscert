package com.vvirlan.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("users/{username: [a-zA-Z][a-zA-Z_0-9]*}")
public class HelloWorldResource {

	@GET
	public String sayHello() {
		return "Hello !";
	}
}


@Path("widgets")
public class WidgetsResource {
  @GET
  String getList() {...}
 
  @GET @Path("{id}")
  String getWidget(@PathParam("id") String id) {...}
}

@Target(value={TYPE,METHOD})
@Retention(value=RUNTIME)
public @interface Path


