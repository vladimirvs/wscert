package com.vvirlan;

import javax.ws.rs.ApplicationPath;

import com.sun.jersey.api.core.PackagesResourceConfig;

@ApplicationPath("rest")
public class MainApp extends PackagesResourceConfig {
	public MainApp() {
		super("com.vvirlan.resource");
	}
}
