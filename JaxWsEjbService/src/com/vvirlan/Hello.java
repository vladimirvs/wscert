package com.vvirlan;

import javax.ejb.Remote;

@Remote
public interface Hello {

	public String hello(String msg);
}
