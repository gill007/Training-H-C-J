package com.wellsbank.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Customer;

public class CustomerDs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		EntityManager em=null;
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("ClassProject");
	   em=emf.createEntityManager();
	   
	 
	   int customerId=1001;
	   //int customerId=1002;
	   
	   System.out.println("Entered Customer Id to Delete is:"+customerId);
		
        try
        {
       Customer customer=em.find(Customer.class, customerId);
       em.getTransaction().begin();
       if(customer!=null)
       {
    	 em.remove(customer);
    	 System.out.println("DELETED");
       }
       else
       {
    	  System.out.println("No such record Exists:");
       }
       em.getTransaction().commit();
        
       }catch(Exception e)
        {
        e.printStackTrace();
        }
       finally {em.close();}
	}

}
