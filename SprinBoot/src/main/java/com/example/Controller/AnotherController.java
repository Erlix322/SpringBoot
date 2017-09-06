package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

	@RequestMapping("/test")
	public String test() {
		return "Greetings from Spring Boot!";
	}
}

