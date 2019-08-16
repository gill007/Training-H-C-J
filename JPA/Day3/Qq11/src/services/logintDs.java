package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Login;

public class logintDs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		EntityManager em=null;
		
        try
        {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        Login lg=new Login();
        lg.setUserId("124556");
        lg.setPassword("hello");
        lg.setRole('D');
       
        
        em.persist(lg);
        System.out.println("Login Persisted");
        em.getTransaction().commit();
       
        
       }catch(Exception e)
        {
       e.printStackTrace();
        }
       finally {em.close();}
	}

}
