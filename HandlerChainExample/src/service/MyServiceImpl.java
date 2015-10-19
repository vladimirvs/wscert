package service;
import java.awt.Image;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

@WebService
@HandlerChain(file="handlers.xml")
public class MyServiceImpl {

	@WebMethod
	public String sayHello() {
		return "Hello";
	}
	
	public String upload(Image data) {
		if (data!=null) {
			System.out.println(data);
			return "Success!";
		}
		throw new WebServiceException("No image received!");
	}
}
