package com.webspringbootexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcom to My First Srping Boot Web App";
	}
}
