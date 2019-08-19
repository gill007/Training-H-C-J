
package com.test.Rest1;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.test.Dao.LoginDao;
import com.test.Model.Login;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Path("login/{username}/{password}")
   
    @Produces("text/plain")
    public String getIt( @PathParam("username") String user,@PathParam("password") String pass) {
    	
    	LoginDao ld=new LoginDao();
    	System.out.println(user+" "+pass);
    	 if(ld.starter(user, pass))
    	 {
    		 return "Valid Credentails";
    	 }
    	 else
    		 return "Not Valid Credentails";
    
        
    	
      
      
       // return lg.toString();
    }
}
