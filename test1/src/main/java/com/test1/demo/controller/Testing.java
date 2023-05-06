package com.test1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {

	@GetMapping("/signinpage")
	public String signin()
	{
		return "signin successfull";
	}
	
	@GetMapping("/landingpage/{username}")
	public String landin(@PathVariable("username")String username)
	{
		return "landing page of the user "+username;
	}
}
