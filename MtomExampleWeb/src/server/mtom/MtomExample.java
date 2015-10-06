package server.mtom;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.MTOM;

@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_MTOM_BINDING)
public class MtomExample {

	@WebMethod
	public String sayHello() {
		return "Hello";
	}
	
	@WebMethod
	public Image getImage() {

		Image img;
		try {
			img = ImageIO.read(new File("C:\\tmp\\uploads\\sourcelogos\\Koala.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return img;
	}
}
