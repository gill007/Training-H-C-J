package com.wellsbank.tableperclass.Service;

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
		    
		    TechAssociate ta = new TechAssociate();
		    ta.setEmpId(1002);
		    ta.setName("adesh");
		    ta.setNoOflABS(3);
		    em.persist(ta);
		    
		    EvangeList el = new  EvangeList();
		    el.setEmpId(1003);
		    el.setName("ruchika");
		    el.setNoOfSessions(3);
		    em.persist(el);
		    
		    em.getTransaction().commit();
		    System.out.println("Persisted tableperclass Q19");
		}
		finally
		{
			em.close();
		}
	}

}
