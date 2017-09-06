package com.example.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.Greeter;

@RestController
public class TestController {

	@Autowired
	private Greeter greeter;
	@RequestMapping("/yolo")
	public String test() {
		return "<h1>Hi from Spring Boot!</h1>" + greeter.greet();
	}
}

