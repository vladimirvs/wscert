package my.ws;

import javax.jws.WebService;

@WebService
public class MyService implements MyInterface{

	public String fromSIB() {
		return "Aha";
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello";
	}
}
