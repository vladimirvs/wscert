package com.me;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService
@MTOM(enabled = true)
public class TestMe {

	@WebMethod
	@MTOM
	public Image download() {
		try {
			return ImageIO.read(new File("C:\\tmp\\pic2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
