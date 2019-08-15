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
		
        try
        {
       
        em.getTransaction().begin();
        
        Customer customer=new Customer();
        customer.setCustId(1001);
        customer.setCustName("Wells");
        
        
        em.persist(customer);
        em.getTransaction().commit();
        System.out.println("Persisted");
        
       }catch(Exception e)
        {
        e.printStackTrace();
        }
       finally {em.close();}
	}

}
