package com.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

	@RequestMapping("/")
	public String greetHello() {
		return "DAs spring  boot app";
	}
	
	@GetMapping("/getGreet")
	public String getGreet() {
		return "DAs spring  boot app";
	}
	
	@GetMapping("/bye")
	public String getBye() {
		return "DAs spring  boot bye app";
	}
	
	@GetMapping("/demo")
	public String getBye1() {
		System.out.println("jjj");
		return "DAs spring  boot bye app";
	}
}
