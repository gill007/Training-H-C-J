package com.eChain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET,value="/lg")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response)
	{
		String rs=request.getParameter("t1");
		
		System.out.println(rs);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		mv.addObject("price",rs);
		
		
		return mv;
	}

}
