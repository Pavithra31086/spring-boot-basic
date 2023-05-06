package com.test6.demo.Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test6.demo.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService usrService;
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody User u)
	{
	
		return usrService.validateUser(u.getUsername(),u.getPassword());
	}
	@PostMapping("/addUser")
	public User deatils(@RequestBody User u)
	{
	return usrService.saveUser(u);
	}

}
