package customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		
		try
		{  
			String name="Beckham";
			int cId=1001;
			EntityTransaction et=em.getTransaction();
			et.begin();
		   // Query query=em.createQuery("Update Customer c set c.name=:customerName where c.customerId=:customerId");
			Query query=em.createQuery("Update Customer c set c.name=?1 where c.customerId=?2");
			//query.setParameter("customerName", name);
			//query.setParameter("customerId", cId);
			query.setParameter(1, name);
			query.setParameter(2, cId);
			int updateCount=query.executeUpdate();
			et.commit();
			
			System.out.println(updateCount+"Row Updated");
			
			
			
		}finally
		{
			em.close();
		}

	}

}
