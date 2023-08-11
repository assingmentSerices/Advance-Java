package com.adda.dollop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.dollop.Bean.User;
import com.adda.dollop.Service.UserService;
@RestController
@RequestMapping("/auth")

public class AuthController {
  @Autowired
	private UserService userservice;
//  user singup
	@PostMapping("/singup")
	public ResponseEntity<User> Singup(@RequestBody User user){
		ResponseEntity<User> responce=new ResponseEntity<User>(this.userservice.Singup(user),HttpStatus.OK);
		return responce;
	}
}
