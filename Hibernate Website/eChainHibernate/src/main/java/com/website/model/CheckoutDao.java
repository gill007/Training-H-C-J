package com.website.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CheckoutDao 
{
	public int putData(String buyername,String itemname, String amount)
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q6");
		EntityManager em=emf.createEntityManager();
		
		try
		{  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now();  
	     System.out.println(dtf.format(now));  
	    em.getTransaction().begin();
	    CheckoutModel cm=new CheckoutModel();
	    cm.setAmount(amount);
        cm.setItemname(itemname);
        cm.setDate(dtf.format(now));
        cm.setName(buyername);
        em.persist(cm);
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
