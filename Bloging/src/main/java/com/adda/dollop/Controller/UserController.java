package com.adda.dollop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.dollop.Bean.User;
import com.adda.dollop.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;

	@GetMapping("/{name}")
	private ResponseEntity<User> findByName(@PathVariable("name" )String name ){
		
		ResponseEntity<User> response = new ResponseEntity<User>(this.userservice.getUserByUserName(name),HttpStatus.OK);
		System.out.println(response+"hello");
		return response;
	}
	
	
}
