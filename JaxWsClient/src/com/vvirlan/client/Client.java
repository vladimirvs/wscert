package com.vvirlan.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlLocation = new URL  ("http://localhost:8080/TestSei/MyCalculatorImplService?wsdl");
		QName serviceName = new QName("http://ws.vvirlan.com/","MyCalculatorImplService");
		Service s = Service.create(wsdlLocation, serviceName);
		
		Iterator<QName> ports = s.getPorts();
		while (ports.hasNext()) {
			QName port = ports.next();
			System.out.println(port);
			
		}
	}
}
