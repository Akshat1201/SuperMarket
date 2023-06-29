package com.superMarket.registration.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class login_Controller {
	
	@GetMapping
	@RequestMapping("/funct1")
	public String funct1() {
		return "working";
	}

}
