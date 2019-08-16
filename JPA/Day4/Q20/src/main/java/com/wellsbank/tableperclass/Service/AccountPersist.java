package com.wellsbank.tableperclass.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.onetoone.Customerg;
import com.wellsbank.onetoone.PermanentAddress;
import com.wellsbank.tableperclass.*;

public class AccountPersist {
	
	public static void main(String args[])
	{
		EntityManager em=null;
		try
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("SingleTable");
		    em=emf.createEntityManager();
		    em.getTransaction().begin();
		    
		   PermanentAddress per=new PermanentAddress();
		   per.setDoorNo(101);
		   per.setState("Punjab");
		   
		   Customerg customer=new Customerg();
		   customer.setCustId(1001);
		   customer.setCustName("adesh");
		   customer.setAddress(per);
		   
		   em.persist(customer);
		   
		    em.getTransaction().commit();
		    System.out.println("Persisted onetoone Q20");
		}
		finally
		{
			em.close();
		}
	}

}
