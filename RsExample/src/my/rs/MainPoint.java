package my.rs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@ApplicationPath("rest")
@Path("a")
public class MainPoint extends Application{
	
	@Path("hello")
	@GET
	public String hello() {
		return "HELLO";
	}

	@Path("sum/{n1}/{n2}")
	@GET
	public int sum(@PathParam("n1") int n1, @PathParam("n2") int n2) {
		return n1 + n2;
	}
	
	
	@Path("/addNumbers/{n1}/{n2}")
	@GET
	public MyResource getMyResource(@PathParam("n1") int n1, @PathParam("n2") int n2) {
		return new MyResource(n1, n2);
	}
}
