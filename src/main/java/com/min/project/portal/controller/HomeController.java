package com.min.project.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "redirect:/home";
	}
	
	@RequestMapping("home")
	public String index()
	{
		return "templates/loginPage.jsp";
	}
	
	@RequestMapping("index")
	public String afterLogin()
	{
		return "templates/index.jsp";
	}
}