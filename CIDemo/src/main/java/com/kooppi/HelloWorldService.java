package com.kooppi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
	
	public HelloWorldService() {}
	
	@GET
	public String getMsg() {
 
 
		return "HelloWorld2";
	}
 
}
