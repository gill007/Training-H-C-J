package com.eChain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET,value="/lg")
	public void login()
	{
		System.out.println("hello");
	}

}
