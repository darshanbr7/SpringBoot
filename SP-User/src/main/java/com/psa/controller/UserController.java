package com.psa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
		@RequestMapping(value="/login",method=RequestMethod.GET)
		 public String ULogin() {
			System.out.println("successfully getting");
			return "login";
		}
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public String Signup(@RequestParam String ename,@RequestParam String epass) {
			System.out.println(ename);
			System.out.println(epass);
			 return "Signup";
		}

}
