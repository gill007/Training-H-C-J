package com.test.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.Model.Login;

public class LoginDao {

	  public boolean starter(String username, String password )
	   {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		Login lg=new Login();
		try
		{
		
		    Login ld=em.find(Login.class, username);
		    if(ld==null)
		    {
		    	return false;
		    }
		    else
		    {   System.out.println("Valid");
		    	return true;
		    }
			
			
		}
		catch(Exception e)
		{
			return false;
		}
		finally
		{
			em.close();
		}
		
		
	}
	
}
