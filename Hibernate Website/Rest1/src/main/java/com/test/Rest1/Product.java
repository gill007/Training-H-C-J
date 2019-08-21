package com.test.Rest1;


import java.util.List;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.Dao.LoginDao;
import com.test.Dao.ProductDao;

import com.test.Model.Products;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myProduct")
public class Product{
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Path("login/{username}/{password}")
   
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Products> getIt( @PathParam("username") String user,@PathParam("password") String pass) {
    	
    	LoginDao ld=new LoginDao();
    	ProductDao p=new ProductDao();
    	List<Products> al=p.starterProduct();
    
    	System.out.println(user+" "+pass+ " "+al.size());
    	System.out.println(al.get(0).getProductName());
    	
    	 if(ld.starter(user, pass))
    	 {
    		
    		return al; 
    	 }
    	 else
    		 return null;
	
    
        
    	
      
      
     
    }
}
