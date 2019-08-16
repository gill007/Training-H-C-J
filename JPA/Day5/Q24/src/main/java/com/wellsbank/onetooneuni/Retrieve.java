package com.wellsbank.onetooneuni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.manytoonebi.Customer;
import com.wellsbank.manytoonebi.Account;

public class Retrieve {

	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		
		try
		{
			Customer customer=em.find(Customer.class,10001);
			System.out.println(customer);
			List li=customer.getAccount();
			System.out.println(li.get(0));
			
			Account acc1=(Account) li.get(0);
			
			
			System.out.println("Customer's First Account Details: "+acc1.getAccountId()+" "+acc1.getAccountType()+" ");
			//System.out.println("Customer's First Account Details: "+acc2.getAccountId()+" "+acc2.getAccountType());
		}finally
		{
			em.close();
		}
		
	}
}
