package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class democontroller {
	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
    public String welcome()
    {
    	return "Welcomeee";
    }
}
