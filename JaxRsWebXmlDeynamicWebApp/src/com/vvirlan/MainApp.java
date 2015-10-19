package com.vvirlan;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.vvirlan.resources.MyResource;

//@ApplicationPath("hi")
public class MainApp extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("HERE");
		Set<Class<?>> classes = new HashSet<>();
		classes.add(MyResource.class);
		return classes;
	}
}
