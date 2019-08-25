package com.springmvc.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.Dao.LoginDao;
import com.springmvc.Model.LoginBean;


@Service
public class MvcService implements MvcInterface {

	@Autowired
	LoginDao loginDao;
	
	public boolean saveOrUpdate(LoginBean lg) {
		return loginDao.saveOrUpdate(lg);
	}

	
	
}