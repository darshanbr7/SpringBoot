package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String getLogin() {
		return "login";
	}
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
	@GetMapping("/login")
	public String getLoginpage() {
		return "loginpage";
	}

}
