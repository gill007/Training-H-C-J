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
	@Override
	public String save(LoginBean login)
	{
		return LoginDao.save(login);
	}
	
	@Transactional
	@Override
	public LoginBean get(String id)
	{
		return LoginDao.get(id);
	}
	
	
	@Transactional
	@Override
	public List<LoginBean> list()
	{
		return LoginDao.list();
	}
	
	@Transactional
	@Override
	public void update(String id,LoginBean login)
	{
		LoginDao.update(id,login);
	}
	
	@Transactional
	@Override
	public void delete(String id)
	{
		LoginDao.delete(id);
	}

}
