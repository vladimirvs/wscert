package servlet;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService (serviceName="LogWebService", name="LogLog")
public class MyWebService {

	@WebMethod
	public String saySomething() {
		System.out.println("CALLED SAY SOMETHING");
		return "SOMETHING";
	}
}
