package com.test.Rest1;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.test.Dao.RegistrationDao;


/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/Registration")
public class RegistrationService{
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @POST
    @Path("register/{username}/{firstName}/{lastName}/{password}/{email}")
   
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String getIt( @PathParam("username") String user,@PathParam("password") String pass,@PathParam("firstName") String fname,
    		@PathParam("lastName") String lname,@PathParam("email") String emails) {
    	
    	RegistrationDao rd=new RegistrationDao();
    	boolean b=rd.putData(user, fname, lname, pass, emails);
    	if(b)
    		return "Successful Registration";
    	else
    		return "Unsuccessful Registration";
    	
     
    }
}

