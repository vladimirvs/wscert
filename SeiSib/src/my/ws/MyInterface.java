package my.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MyInterface {

	@WebMethod
	public String sayHello();
	
}
