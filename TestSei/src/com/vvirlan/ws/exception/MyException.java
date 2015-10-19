package com.vvirlan.ws.exception;

import javax.xml.ws.WebFault;

@WebFault(name="MyFault_Name",messageName="Miau")
public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5312562339497981395L;

	public MyException() {
		super();
	}
	
	public MyException(String s) {
		super(s);
	}
	
 }
