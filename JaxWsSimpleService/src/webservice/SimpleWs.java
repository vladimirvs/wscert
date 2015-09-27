package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SimpleWs {

	@WebMethod
	public String sayHello() {
		return "Hello World!";
	}
}
