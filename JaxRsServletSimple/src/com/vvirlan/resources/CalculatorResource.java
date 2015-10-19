package com.vvirlan.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/calculator")
public class CalculatorResource {

	@GET
	@Path("sum/{a}/{b}")
	public Double getSum(@PathParam("a") Double a, @PathParam("b") Double b) {
		System.out.println("In get sum");
		return a + b;
	}
}
