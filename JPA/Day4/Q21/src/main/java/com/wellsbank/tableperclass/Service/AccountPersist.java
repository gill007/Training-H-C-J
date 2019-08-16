package com.wellsbank.tableperclass.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.manytoone.*;

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
		    
		  Customer customer=new Customer();
		  customer.setCustId(10001);
		  customer.setCustName("Adesh");
		  
		  Account account=new Account();
		  account.setAccountId(1001);
		  account.setAccountType("Current");
		  account.setCustomer(customer);
		   
		  Account account1=new Account();
		  account1.setAccountId(1002);
		  account1.setAccountType("Savings");
		  account1.setCustomer(customer);
		   em.persist(account);
		   em.persist(account1);
		   
		    em.getTransaction().commit();
		    System.out.println("Persisted manytoone Q21");
		}
		finally
		{
			em.close();
		}
	}

}
