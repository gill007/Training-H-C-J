package com.wellsbank.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.onetoonebi.Customer;
import com.wellsbank.onetoonebi.PermanentAddress;

public class Retrieve {

	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		
		PermanentAddress pr1=em.find(PermanentAddress.class, 102);
		Customer cust2=pr1.getCustomer();
		
		System.out.println("Customer Id:"+cust2.getCustId());
		System.out.println("Customer Name:"+cust2.getCustName());
		System.out.println("Customer Details of customer living in 102");
		
	}
}
