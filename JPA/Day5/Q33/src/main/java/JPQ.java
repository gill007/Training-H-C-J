import java.util.List;

import javax.persistence.Query;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;




public class JPQ {
	
	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		try
		{
			
			Query q=em.createNativeQuery("select jobDescription(3)");
			System.out.println("before Execution");
			List<String> ls=q.getResultList();
			for(String s:ls)
			{
				System.out.println(s);
			}
			
		}finally
		{
			em.close();
		}
	}
	
	
}
