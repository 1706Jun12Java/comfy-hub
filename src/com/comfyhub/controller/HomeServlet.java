package com.comfyhub.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeServlet {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getPerson(){
		//could (and probably should) be calling other code here!!! 
		System.out.println("f/l"); 
		return "index";
	}
}