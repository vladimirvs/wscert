package com.vvirlan.provider;

import java.io.ByteArrayInputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Provider;
import javax.xml.ws.WebServiceProvider;

import org.w3c.dom.Node;

@WebServiceProvider
public class ProviderImpl implements Provider<Source>{

	@Override
	public Source invoke(Source request) {
	
		try {
		      DOMResult dom = new DOMResult();
		      Transformer trans = TransformerFactory.newInstance().newTransformer();
		      trans.transform(request, dom);
		      Node node = dom.getNode();
		      // Get the operation name node.
		      Node root = node.getFirstChild();
		      // Get the parameter node.
		      Node first = root.getFirstChild();
		      String input = first.getFirstChild().getNodeValue();
		      // Get the operation name.
		      String op = root.getLocalName();
		      if ("invokeNoTransaction".equals(op)) {
		        return sendSource(input);
		      } else {
		        return sendSource2(input);
		      }
		    }
		    catch (Exception e) {
		      throw new RuntimeException("Error in provider endpoint", e);
		    }
	
		
		
	}
	
	private Source sendSource(String input) {
	    String body =
	        "<ns:invokeNoTransactionResponse "+
	             "xmlns:ns=\"http://jaxws.webservices.examples/\"><return>"
	            + "constructed:" + input
	            + "</return></ns:invokeNoTransactionResponse>";
	    Source source = new StreamSource(new ByteArrayInputStream(body.getBytes()));
	    return source;
	  }
	 
	  private Source sendSource2(String input) {
	    String body =
	        "<ns:invokeTransactionResponse "+
	            "xmlns:ns=\"http://jaxws.webservices.examples/\"><return>"
	            + "constructed:" + input
	            + "</return></ns:invokeTransactionResponse>";
	    Source source = new StreamSource(new ByteArrayInputStream(body.getBytes()));
	    return source;
	  }

}
