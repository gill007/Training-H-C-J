package com.test.Dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.test.Model.Products;



public class ProductDao {

	public List<Products> starterProduct() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		 try
		 {
			
			 Products p=new Products();
			 Query que=em.createNamedQuery("getDataForProduct",Products.class);
			 List<Products> al=(List<Products>)que.getResultList();
			 al.get(0).getProductName();
			 System.out.println("Persisted Product");
			 return al;
			
			 
			 
		 }
		 finally
		 {
			 em.close();
		 }
		

	}

}
