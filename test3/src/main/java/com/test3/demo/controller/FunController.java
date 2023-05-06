package com.test3.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

	@GetMapping("/Login")
	public String fun(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("Pavi")&&password.equals("1086"))
		{
			 return "Login Successful";
		}
		else
		{
			return "Invalid User";
		}
			 
	}
}
