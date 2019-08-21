package com.test.Dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.Model.Registration;




public class RegistrationDao {
	
	
	public boolean putData(String username,String firstName,String lastName,String password,String email)
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
	EntityManager em=emf.createEntityManager();
	 try
	 {
		
		 em.getTransaction().begin();
		 Registration r = new Registration();
		 r.setEmail(email);
		 r.setFirstName(firstName);
		 r.setLastName(lastName);
		 r.setPassword(password);
		 r.setUsername(username);
		
		 em.persist(r);
		 System.out.println("Persisted");
		 em.getTransaction().commit();
		 return true;
		 
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

