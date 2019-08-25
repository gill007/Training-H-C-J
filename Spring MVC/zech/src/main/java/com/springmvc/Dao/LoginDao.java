package com.springmvc.Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.springmvc.Model.LoginBean;

@Repository
public class LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	
    public boolean saveOrUpdate(LoginBean login) {
		
    	Session se=sessionFactory.getCurrentSession();
    	se.persist(login);
    	String name=login.getUsername();
    	System.out.println(name);
    	return true;
	}

}
