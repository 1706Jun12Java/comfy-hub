package com.comfyhub.controller;
 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.comfyhub.domain.*;

@Controller
@RequestMapping("/person")
public class PersonServlet {

	@RequestMapping(value="/{firstName}/{lastName}",method=RequestMethod.GET)
	public String getPerson(@PathVariable String firstName, @PathVariable String lastName, Model m){
		//could (and probably should) be calling other code here!!! 
		System.out.println("f/l");
		m.addAttribute("firstName",firstName);
		m.addAttribute("lastName",lastName);
		return "demoOne";
	}
	
	@RequestMapping(value="/addInfo",method=RequestMethod.GET)
	public String getPersonInfo(Model m){
		System.out.println("addinfo");
		m.addAttribute("user",new User());
		return "infoPage";
	}
	
	@RequestMapping(value="/addInfo",method=RequestMethod.POST)
	public String addPersonInfo(User user, BindingResult br, Model m){
		if(br.hasErrors()){
			Object errors  = br.getAllErrors();
			m.addAttribute("errors",errors);
			return "infoPage";
		} else {
			m.addAttribute("firstName",user.getFirstName());
			m.addAttribute("lastName",user.getLastName()); 
			return "infoPage";
		}
		
	}
}