package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloGreeter implements Greeter {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
