package com.website.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Registration;

public class RegDao {
	
	private RegBean rb;
	
	public RegDao(RegBean rb)
	{
		this.rb=rb;
	}
	
	public int putData()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q6");
		EntityManager em=emf.createEntityManager();
		
		try
		{  
	    em.getTransaction().begin();
	    em.persist(rb);
	    em.getTransaction().commit();
	    
		}
		catch(Exception e)
		{
			return 0;
		}
	    finally{
			em.close();
		}

		 return 1;
	}


}
