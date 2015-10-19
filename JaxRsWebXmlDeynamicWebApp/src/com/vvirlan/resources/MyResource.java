package com.vvirlan.resources;

import java.net.URI;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObjectBuilder;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import sun.awt.image.URLImageSource;

@Path("hello")
public class MyResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN + "; charset=utf-8")
	@Path("users/{username: [a-zA-Z][a-zA-Z_0-9]*}")
	public String getHello(@PathParam("username") String username) {
		return "שָׁלוֹ " + username;
	}

	@GET
	@Path("users/{username: [0-9][a-zA-Z_0-9]*}")
	public String getAnother(@PathParam("username") String username) {
		return "HELLO " + username;
	}

	@GET
	public String getQueryParam(@DefaultValue("22") @QueryParam("p1") String p1) {
		return "Hello P1 = " + p1;
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String getPost(MultivaluedMap<String, String> formParams) {

		for (String key : formParams.keySet()) {
			System.out.println(key + " " + formParams.get(key));
		}

		return "Ok";

	}

	@Path("another")
	public AnotherResource getAnotherResource() {
		return new AnotherResource();
	}
	
	@GET
	@Path("response")
	public Response post(String content) {
		
	}
	




}
