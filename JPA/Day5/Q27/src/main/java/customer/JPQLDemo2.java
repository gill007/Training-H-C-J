package customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		
		try
		{   int customerId=1001;
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			Query query = em.createQuery("select c from Customer c where c.customerId=?1");
			query.setParameter(1, customerId)
			List rs=query.getResultList();
			int size=rs.size();
			
			System.out.println("Name          Address     City     Email");
			
			for(int i=0;i<size;i++)
			{
				Customer c=(Customer)rs.get(i);
				System.out.println("");
				System.out.print(c.getName()+"  ");
				System.out.print(c.getAddress()+ " ");
				System.out.print(c.getCity()+" ");
				System.out.println(c.geteMail()+"  ");
			}
			
			
		}finally
		{
			em.close();
		}

	}

}
