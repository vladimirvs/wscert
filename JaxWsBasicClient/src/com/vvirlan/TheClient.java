package com.vvirlan;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class TheClient {

	public static void main(String[] args) {
		TheClient cl = new TheClient();
		cl.run();
	}

	public void run() {

		Authenticator myAuth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("acv", "acv".toCharArray());
			}
		};

		Authenticator.setDefault(myAuth);
		MainService service = new MainService();
		Main port = service.getMainPort();
		// This would work, but you will get a 401 error on MainService service
		// = new MainService();
		// BindingProvider bp = (BindingProvider) port;
		// bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "acv");
		// bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "acv");

		String result = port.sayHello();
		System.out.println(result);
	}
}
