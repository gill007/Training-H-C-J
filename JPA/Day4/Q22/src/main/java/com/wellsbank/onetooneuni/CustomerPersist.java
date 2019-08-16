package com.wellsbank.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.onetoonebi.Customer;
import com.wellsbank.onetoonebi.PermanentAddress;

public class CustomerPersist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentAddress permanent= new PermanentAddress();
		permanent.setDoorNo(102);
		permanent.setState("Punjab");
		
		Customer cust=new Customer();
		cust.setCustId(1002);
		cust.setCustName("Adesh");
		cust.setAddress(permanent);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			em.getTransaction().begin();
			em.persist(cust);
			em.getTransaction().commit();
			System.out.println("Q23");
		}
		finally
		{
			em.close();
		}

	}

}
