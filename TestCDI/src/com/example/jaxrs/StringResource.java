package com.example.jaxrs;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("cdiexample")
@RequestScoped
public class StringResource {

	@Inject
	private MyService service;

	public StringResource() {

	}

	@Context
	private HttpHeaders httpHeaders;

	@PostConstruct
	private void postCons() {

	}

	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String get() {
		return service.getMessage();
	}
}
