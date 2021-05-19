package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping
	public String welcome() {
		return "<h1> Welcome to the Application</h1>";
	}
}
