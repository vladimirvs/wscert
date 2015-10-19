package com.vvirlan.service;

import javax.xml.ws.Endpoint;

public class PublisherMy {

	public static void main(String[] args) {
		PublisherMy p = new PublisherMy();
		p.run();
	}
	
	public void run() {
		Test test = new Test();
		Endpoint e = Endpoint.publish("http://localhost:8080/test", test);
	}
}
