package customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		
		try
		{  
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			Query query = em.createQuery("select c from Customer c where c.customerId=:custId");
			query.setParameter("custId", 1001);
			List rs=query.getResultList();
			int size=rs.size();
			
			System.out.println("Name          Address     City     Email");
			
			if(size!=0) {
			for(int i=0;i<size;i++)
			{
				Customer c=(Customer)rs.get(i);
				System.out.println("");
				System.out.print(c.getName()+"  ");
				System.out.print(c.getAddress()+ " ");
				System.out.print(c.getCity()+" ");
				System.out.println(c.geteMail()+"  ");
			}
			}
			else
			{
				System.out.println("No record exists");
			}
			
		}finally
		{
			em.close();
		}

	}

}
