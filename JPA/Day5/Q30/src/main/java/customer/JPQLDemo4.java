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
		    Query query=em.createNamedQuery("findName");
			List li=query.getResultList();
			et.commit();
			int size=li.size();
			if(size!=0)
			{
				Customer c=(Customer)li.get(0);
				System.out.println(c.name+" "+c.userId+" "+c.eMail);
			}
			else
			{System.out.println("no record ");}
			
		    System.out.println("q30");

			
			
		}finally
		{
			em.close();
		}

	}

}
