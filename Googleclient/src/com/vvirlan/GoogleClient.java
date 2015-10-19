package com.vvirlan;



import java.net.URL;
import java.security.cert.Certificate;

import javax.net.ssl.HttpsURLConnection;

public class GoogleClient {

	private static final String endpoint = "https://www.google.com:443/";
	
	public static void main(String[] args) {
		new GoogleClient().doIt();
	}

	private void doIt() {
		try {
			URL url = new URL(endpoint);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setDoInput(true);
			conn.connect();
			dumpDetails(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void dumpDetails(HttpsURLConnection conn) {
		try {
		System.out.println("Status code: "+conn.getResponseCode());
		System.out.println("Ciher suite: "+conn.getCipherSuite());
		Certificate[] certs = conn.getServerCertificates();
		
		for (Certificate cert : certs) {
			System.out.println("Cert type: "+cert.getType());
			System.out.println("Hash code: "+cert.hashCode());
			System.out.println("Algorithm: "+cert.getPublicKey().getAlgorithm());
			System.out.println("Format: "+cert.getPublicKey().getFormat());
		}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		System.out.println();
		
		
		
	}
	
	
	
}
