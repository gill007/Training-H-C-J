package com.wellsbank.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Account;

public class AccountDs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int accountNo;
		double balance;
		String CustomerName;
		String userId;
		EntityManager em=null;
		BufferedReader rs =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Account Number:");
		accountNo=Integer.parseInt(rs.readLine());
	
		System.out.println("Enter Account Balance");
		balance=Double.parseDouble(rs.readLine());
		
		System.out.println("Enter Customer Name");
		CustomerName=rs.readLine();

		System.out.println("Enter UserID");
		userId=rs.readLine();
		
		//System.out.println(accountNo+" "+balance+" "+CustomerName+" "+userId);
        try
        {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        
        Account account=new Account();
        account.setAccountNo(accountNo);
        account.setBalance(balance);
        account.setCustomerName(CustomerName);
        account.setUserId(userId);
        
        em.persist(account);
        em.getTransaction().commit();
        System.out.println("Persisted");
        
       }catch(Exception e)
        {
e.printStackTrace();
        }
       finally {em.close();}
	}

}
