package com.website.model;


import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class MainDao {
	
	
	
	public ArrayList<MainBean> getImage()
	{
		
		ArrayList<MainBean> mb=new ArrayList<MainBean>();
	
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q6");
			EntityManager em=emf.createEntityManager();
			
			try
			{  
		    EntityTransaction et=em.getTransaction();
		    et.begin();
		    System.out.println("before HELLO");
		    Query que=em.createNamedQuery("getDataForProduct",MainBean.class);
		    mb =(ArrayList<MainBean>)que.getResultList();
			
			}
		    finally{
				em.close();
			}
		  
		  
		 

		 return mb;
	}

}
