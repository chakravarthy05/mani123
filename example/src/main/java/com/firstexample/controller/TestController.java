package com.firstexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("getString")
	public String getString() {
		return "first hi  friends";
	}
	
	

}
