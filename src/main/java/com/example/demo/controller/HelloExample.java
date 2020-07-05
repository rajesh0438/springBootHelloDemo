package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloExample {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hi Rajesh, welcome to the Application";
	}
	
	
}
