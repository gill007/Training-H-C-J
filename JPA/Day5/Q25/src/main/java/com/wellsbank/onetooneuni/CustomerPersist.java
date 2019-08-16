package com.wellsbank.onetooneuni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.manytomanybi.Account;
import com.wellsbank.manytomanybi.JointAccountHolder;


public class CustomerPersist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Account acc1=new Account();
	    acc1.setAccountId(1111);
	    
	    Account acc2=new Account();
	    acc2.setAccountId(2222);
	    
	    List list = new ArrayList();
	    list.add(acc1);
	    list.add(acc2);
	    
	    JointAccountHolder joint= new JointAccountHolder();
	    joint.setCustomerId(101201);
	    joint.setBalance(20000);
	    joint.setAccount(list);
	    
	    
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			em.getTransaction().begin();
			em.persist(joint);
			em.getTransaction().commit();
			System.out.println("Q24");
		}
		finally
		{
			em.close();
		}

	}

}
