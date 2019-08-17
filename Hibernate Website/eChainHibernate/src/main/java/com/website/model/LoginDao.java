package com.website.model;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LoginDao {
	
	private String username;
	private String password;


	
	public LoginDao(String i, String j) {
		// TODO Auto-generated constructor stub
		this.username=i;
		this.password=j;
	}

	public LoginBean getData()
	{
		LoginBean m=new LoginBean();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
		EntityManager em=emf.createEntityManager();
		
		try
		{  
	    m= em.find(LoginBean.class, username);
	    if(m==null)
	    {
		   System.out.println("No record Found");
		   
	    }
	    else
	    {  System.out.println();
		   System.out.println(m.getName());
		   System.out.println(m.getPassword());
		   System.out.println();
	    }
	    
		}
	    finally{
			em.close();
		}
		return m;
	}
}
