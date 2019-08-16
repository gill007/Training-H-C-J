package com.wellsbank.singletable.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.singletable.*;

public class AccountPersist {
	
	public static void main(String args[])
	{
		EntityManager em=null;
		try
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("SingleTable");
		    em=emf.createEntityManager();
		    em.getTransaction().begin();
		    
		   PartTimeEmployee pte=new PartTimeEmployee();
		   pte.setEmpId(1001);
		   pte.setName("Joe");
		   pte.setWages(100);
		   em.persist(pte);
		   
		   FullTimeEmployee fte=new FullTimeEmployee();
		   fte.setEmpId(1002);
		   fte.setName("Ram");
		   fte.setSalary(12000);
		   em.persist(fte);
		    
		    em.getTransaction().commit();
		    System.out.println("Persisted y");
		}
		finally
		{
			em.close();
		}
	}

}
