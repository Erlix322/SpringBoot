package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Entity.User;
import com.example.Repository.UserRepository;
import com.example.Service.Greeter;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	
	@GetMapping("/all")
	public @ResponseBody Iterable<User> getAllUser() {
		return ((CrudRepository<User, Long>) userRepository).findAll();
	}
	
	@GetMapping("/add")
	public @ResponseBody String addUser(){
		
		String msg = "User Saved";
		try {			
			
			User u = userRepository.save(new User("Eric","Bla"));
			System.out.println(u);
			
		}catch(Exception e) {
			msg = e.getMessage();
			return msg;
		}
		
		return msg;
		
	}
}
