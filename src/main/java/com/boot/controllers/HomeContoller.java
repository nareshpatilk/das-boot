package com.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

	@RequestMapping("/")
	public String greetHello() {
		return "DAs spring  boot app";
	}
}
