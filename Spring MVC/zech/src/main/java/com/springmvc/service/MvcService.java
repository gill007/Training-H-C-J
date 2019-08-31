package com.springmvc.service;

import org.springframework.stereotype.Service;

import com.springmvc.Dao.LoginDao;
import com.springmvc.Model.LoginBean;




@Service
public class MvcService implements MvcInterface {

	
	LoginDao loginDao;
	
	public boolean saveOrUpdate(LoginBean lg) {
		return loginDao.saveOrUpdate(lg);
	}

	
	
}