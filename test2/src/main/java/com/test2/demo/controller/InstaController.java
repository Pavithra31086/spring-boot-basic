package com.test2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstaController {

	@GetMapping("/getInsta")
	public String getInsta(@RequestParam String username)
	{
		return "This the insta profile of "+username;
	}
	
}
