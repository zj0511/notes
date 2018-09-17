package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/notes")
public class DemoController {

	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String index() {
		return "demo";
	}
}