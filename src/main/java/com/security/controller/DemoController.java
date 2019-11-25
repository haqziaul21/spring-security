package com.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasRole('ADMIN')")
public class DemoController {

	@GetMapping("/demo")
	public String demo() {
		return "Demo";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
