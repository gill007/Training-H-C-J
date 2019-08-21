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
		    else if(password.equals(ld.getPassword()))
		    {   System.out.println("Valid");
		    	return true;
		    }
		    
		    else
		    {
		    	return false;
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
	  
	  public boolean updateData(String username,String password)
	  {
		    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
			EntityManager em=emf.createEntityManager();
			
			try
			{
				em.getTransaction().begin();
				Login l=new Login();
				l=em.find(Login.class, username);
				if(l==null)
				{
					return false;
				}
				else
				{
					l.setPassword(password);
					em.persist(l);
					em.getTransaction().commit();
					 return true;
				}
					
		  
		     
		  
	      }catch(Exception e)
			{
	    	  return false;
			}
			
			finally
			{
		  em.close();
			}
	
}
	  
	  
	  public boolean deleteData(String username,String password)
	  {
		    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
			EntityManager em=emf.createEntityManager();
			
			try
			{
				em.getTransaction().begin();
				Login l=new Login();
				l=em.find(Login.class, username);
				if(l==null)
				{
					return false;
				}
				else
				{
					if(password.equals(l.getPassword()))
					{
						System.out.println(l.getUsername()+" Deleted");
						em.remove(l);
						
						em.getTransaction().commit();
						return true;
					}
					else
					{
						System.out.println("Not in record");
						return false;
					}
				}
					
		  
		     
		  
	      }catch(Exception e)
			{
	    	  return false;
			}
			
			finally
			{
		  em.close();
			}
	
}
}
