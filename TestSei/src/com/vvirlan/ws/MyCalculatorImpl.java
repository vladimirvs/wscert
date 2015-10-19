package com.vvirlan.ws;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.vvirlan.ws.exception.MyException;

@WebService(endpointInterface = "com.vvirlan.ws.MyCalculator", name = "MYNAME")
public class MyCalculatorImpl implements MyCalculator {

	@Resource
	private WebServiceContext context;
	
	@Override
	public int sum(int a, int b) {
		
		return a + b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) throws MyException {
		if (b == 0)
			throw new MyException("WTF?");
		return a / b;
	}

	@Override
	public String sayHello() {
		return "Hello";
	}

	@Override
	public void nothing() {
		// TODO Auto-generated method stub
		
	}

}
