package com.echain.service;

import java.util.List;

import com.echain.model.LoginBean;

public interface LoginService {
	
	String save(LoginBean login);
	LoginBean get(String id);
	List<LoginBean> list();
	void update(String id, LoginBean login);
	void delete(String id);
	

}
