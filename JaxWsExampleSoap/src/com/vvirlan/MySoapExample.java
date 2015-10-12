package com.vvirlan;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MySoapExample {

	@WebMethod
	public List<Person> sayHello(String name) throws WhatTheFuckException {
		if (name == null || name.equals("?"))
			throw new WhatTheFuckException("This name is not supported");
		Address a = new Address("Street Main", "100");
		Person p1 = new Person("Vlad", 32, a);
		Person p2 = new Person("Vladimir", 32, a);
		List<Person> persons = new ArrayList<>();

		persons.add(p1);
		persons.add(p2);

		return persons;
	}
}
