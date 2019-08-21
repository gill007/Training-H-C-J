package com.test.Rest1;


import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.Dao.LoginDao;



/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/Delete")
public class DeleteService{
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @DELETE
    @Path("delete/{username}/{newpassword}")
   
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String getIt( @PathParam("username") String user,@PathParam("newpassword") String pass) {
    	
    	LoginDao ld=new LoginDao();
    	boolean b =ld.deleteData(user,pass);
    	if(b)
    		return "Successful Deletion";
    	else
    		return "Unsuccessful in Deletion";
    	
     
    }
}

