package com.springmvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.Dao.LoginDao;
import com.springmvc.Model.LoginBean;




@Controller
public class LoginController {
	
	

	@RequestMapping(method=RequestMethod.POST,value="/loginController")
	public void login(@RequestParam("username") String user,@RequestParam("password") String pass)
	{
	 System.out.println(user+"  "+pass);
	 LoginBean login=new LoginBean();
	 login.setUsername(user);
	 login.setPassword(pass);
	 
	 LoginDao ld=new LoginDao();
	 ld.saveOrUpdate(login);
	 System.out.println("persisted");
		
	}

}
