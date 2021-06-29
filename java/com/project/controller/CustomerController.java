package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
