package com.deloitte.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	@GetMapping("/disp")
	public String getDislay( ) {
		return "Display";
	}
	
	@PostMapping("/validateLogin")
	public String authenticateLogin(@RequestParam("uid")String username, @RequestParam("pwd")String password,Model model) {
		String message="";
		if(username.equals(password))
			message="Welcome to the site";
		else
			message="Invalid username/password";
		model.addAttribute("message",message);
		return "Display";
	}

}
