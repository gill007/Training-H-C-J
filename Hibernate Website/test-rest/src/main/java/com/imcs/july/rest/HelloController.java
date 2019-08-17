package com.imcs.july.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController  {
	
	@GET
	public String sayHello(@QueryParam("name") String name) {
		
		return "Hello From : Mr. "+name;
		//http://localhost:8080/test-rest/hello
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> postHello(User user) {
		
		 List<User> users= new ArrayList<User>();
		 users.add(user);
		 users.add(user);
		 users.add(user);
		return users;
		//http://localhost:8080/test-rest/hello
	}

}
