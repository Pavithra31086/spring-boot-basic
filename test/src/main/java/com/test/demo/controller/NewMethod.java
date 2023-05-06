package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewMethod {

	@GetMapping("/Login")
	public String Login()
	{
		return "Login successfull";
	}
}
