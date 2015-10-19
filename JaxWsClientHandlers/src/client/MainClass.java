package client;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.soap.MTOMFeature;

import service.MyServiceImpl;
import service.MyServiceImplService;

public class MainClass {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		MainClass cl = new MainClass();
		//cl.runHandler();
		cl.runMtom();
		
	}

	
	
	private void runMtom() throws IOException {
		MyServiceImplService service = new MyServiceImplService();
		MyServiceImpl port = service.getMyServiceImplPort(new MTOMFeature());
		uploadImage(port);
		
	}

	
	


	private void uploadImage(MyServiceImpl port) throws IOException {
		port.upload(new byte[]{0x12, 0x01, 0x11});
	}



	public void runHandler() {
		MyServiceImplService service = new MyServiceImplService();
		HandlerResolver handlerResolver = service.getHandlerResolver();
		MyServiceImpl port = service.getPort(MyServiceImpl.class);
		port.sayHello();
	}
}
