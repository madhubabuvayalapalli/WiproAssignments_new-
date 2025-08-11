package com.wipro.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@GetMapping("/")
	public String homepage()
	{
		return "home";
	}
	
	
	@GetMapping("/contact")
	public String contactpage()
	{
		return "contact";
	}

	
	@GetMapping("/test")
	public String testpage()
	{
		return "test";
	}
	
	@GetMapping("/education")
	public String education()
	{
		return "education";
	}


}
