package com.smruti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
@RequestMapping("/welcome")
public class WelcomeRestController {

	@GetMapping
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "welcome to first web apllication example");
		mav.setViewName("index");
		return mav;
	}
	
}
