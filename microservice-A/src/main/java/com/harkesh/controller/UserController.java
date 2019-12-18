package com.harkesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class UserController {
	

	@GetMapping(value = "/hello")
	public String getMessage() {
		return "Hello Java";
	}
	
	@GetMapping(value = "/v1")
	public String welcome() {
		return "Welcome in Java World";
	}
	

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in Second Service";
	}
}
