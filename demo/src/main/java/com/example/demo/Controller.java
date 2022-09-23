package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/employee")
	public String showdata() {
		
		return "incontroller";
	}


	@GetMapping("/student")
	public void showdata1() {
		
		System.out.println("student incontroller");
	}

	
}
