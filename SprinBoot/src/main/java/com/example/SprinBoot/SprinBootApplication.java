package com.example.SprinBoot;


import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.Entity.User;
import com.example.Repository.UserRepository;

@SpringBootApplication
@ComponentScan({"com.example.Service","com.example.SprinBoot", "com.example.Controller","com.example.Repository","com.example.Entity"})
@EntityScan("com.example.Entity")
@EnableJpaRepositories("com.example.Repository")
public class SprinBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("BEans");
			String[] beans = ctx.getBeanDefinitionNames();
			UserRepository ur = ctx.getBean(UserRepository.class);
			
			
			
			List<User> list = Arrays.asList(new User("Eric","lol@lol.de"),new User("Eric","lol@lol.de"));
		
			ur.save(list);
			Arrays.sort(beans);
		    
			for(String bean:beans) {
				System.out.println(bean);
			}
		};
		
	}
}
