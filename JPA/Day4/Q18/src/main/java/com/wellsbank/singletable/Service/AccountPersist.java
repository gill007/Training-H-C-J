package com.wellsbank.singletable.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		    
		    SavingsAccount savings=new SavingsAccount();
		    savings.setAccountNo(1001);
		    savings.setBalance(200.00);
		    savings.setInterestRate(12.22);
		    savings.setMinBalance(100);
		    em.persist(savings);
		    
		    LoanAccount loan=new LoanAccount();
		    loan.setAccountNo(1002);
		    loan.setBalance(1200);
		    loan.setLoanAmount(1200);
		    loan.setLoanType("Car Loan");
		    em.persist(loan);
		    
		    em.getTransaction().commit();
		    System.out.println("Persisted tableperclass");
		}
		finally
		{
			em.close();
		}
	}

}
