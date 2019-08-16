package customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		
		try
		{    
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query findAllCust=em.createNamedQuery("findAllCustomers");
		Query deleOneCust=em.createNamedQuery("deleteOneCustomer");
		
		deleOneCust.setParameter(1, 104);
		int del=deleOneCust.executeUpdate();
		System.out.println(del+"Rows Deleted");
		
		List candidates = findAllCust.getResultList();
		int size=candidates.size();
		
		for(int i=0;i<size;i++)
		{
			Customer cd=(Customer)candidates.get(i);
			System.out.println(cd.getName());
		}
			
			et.commit();

			
			
		}finally
		{
			em.close();
		}

	}

}
