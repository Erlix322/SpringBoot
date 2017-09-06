package com.example.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetConfiguerer {

	@Bean
	@Primary
	public Greeter getGreeter() {
		return new ByeGreeter();
	}
}
