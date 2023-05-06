package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class first {
	@ResponseBody
	@RequestMapping(value="/start",method=RequestMethod.GET)
    public String start()
    {
    	return "Start";
    }
	@ResponseBody
	@RequestMapping(value="/end",method=RequestMethod.GET)
    public String end()
    {
    	return "End";
    }
}
