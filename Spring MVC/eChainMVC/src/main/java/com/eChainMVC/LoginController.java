package com.eChainMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/add")
	public void add()
	{
		System.out.println("Im at Login");
	}

}
