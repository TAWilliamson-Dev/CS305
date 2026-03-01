package com.snhu.sslserver;

import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
	@RequestMapping("/hash")
	public String myHash(){
		
	
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
	
		
			String data = "Hello Travis Williamson!";
			byte[] digestBytes = md.digest(data.getBytes("UTF-8"));
			
			String hex = String.format("%064x",  new BigInteger(1, digestBytes));
		
	    	return "<p>data:"+data+"<br><br>SHA-256 Checksum: "+hex;
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}        
		return null;
	}
}