package com.echain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.echain.dao.LoginDao;
import com.echain.model.LoginBean;

@Service
@Transactional
public class LoginServiceImp implements LoginService{
	
	@Autowired
	private LoginDao loginDao;
	
	@Transactional
	public String save(LoginBean login)
	{
		return loginDao.save(login);
	}
	
	@Transactional
	public LoginBean get(String id)
	{
		return loginDao.get(id);
	}
	
	
	@Transactional
	public List<LoginBean> list()
	{
		return loginDao.list();
	}
	
	@Transactional
	public void update(String id,LoginBean login)
	{
		loginDao.update(id,login);
	}
	
	@Transactional
	public void delete(String id)
	{
		loginDao.delete(id);
	}

}
