package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Brand;

public class BrandDs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		EntityManager em=null;
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("ClassProject");
	   em=emf.createEntityManager();
		
        try
        {
       
        em.getTransaction().begin();
        
        Brand brand=new Brand();
        brand.setBrandid(101);
        brand.setBrandname("indigonation");
        Calendar d=new GregorianCalendar(2019,8,15);
        brand.setDateoflaunch(d);
        
        
        em.persist(brand);
        em.getTransaction().commit();
        System.out.println("Persisted");
        
       }catch(Exception e)
        {
        e.printStackTrace();
        }
       finally {em.close();}
	}

}
