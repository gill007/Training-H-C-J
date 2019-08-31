package com.springmvc.Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.Model.LoginBean;

@Repository
public class LoginDao implements LoginInterface {
	
    @Autowired
	private SessionFactory sessionFactory; 
    
    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
     }
	
	

    @Transactional
    public boolean saveOrUpdate(LoginBean login) {
		System.out.println(sessionFactory);
    	System.out.println("hello");
    	Session se=sessionFactory.getCurrentSession();
    	se.persist(login);
    	String name=login.getUsername();
    	System.out.println(name);
    	return true;
	}

}
