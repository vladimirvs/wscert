package com.vvirlan.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.ResponseWrapper;

import com.vvirlan.ws.exception.MyException;

@WebService(name = "NAMEE", serviceName = "SERVICENAME", portName = "THEPORTNAME")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface MyCalculator extends MyBaseCalculator {

	@WebResult(name="SUMRESULT", header=true) int sum(@WebParam(name="THE_A") int a, int b);

	@Oneway
	void nothing();

	@Action(input = "MyInput", output = "MyOutput", fault = {
			@FaultAction(value = "HelloFault", className = MyException.class) })
	
@XmlElement(name="NAME")
@WebResult(name="NAME")
	int mul(int a, int b);

	@WebMethod(operationName = "THEDIV", action="THEWMACTION")
	@ResponseWrapper (className="TheResponseClassName", partName="TheResponsePartName",localName="TheDivLocalName")
	int div(int a, int b) throws MyException;

}
