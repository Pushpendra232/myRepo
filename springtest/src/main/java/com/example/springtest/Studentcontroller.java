package com.example.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
	
	
	@GetMapping
	public String M1() {
		return "hi";
	}

}
