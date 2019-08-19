package com.test.eChainRest;
import javax.ws.rs.Path;

@Path("Hello")
public class Resource {

	public String getRes()
	{
		return "HELLO";
	}
}
