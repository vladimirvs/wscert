package webxmljaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.vvirlan.resources.HelloResource;

public class MainApp extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		System.out.println("IN GET CLASSES");
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(HelloResource.class);
		return classes;
	}
}
