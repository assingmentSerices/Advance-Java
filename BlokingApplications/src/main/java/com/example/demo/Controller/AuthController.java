package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.User;
import com.example.demo.ExcptionHandler.UserFoundException;
import com.example.demo.Helper.LoginData;
import com.example.demo.Service.UserService;


@RestController
@RequestMapping("/auth")
public class AuthController{
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/singup")
	public ResponseEntity<User> singup(@RequestBody User user) throws Exception{
		
		ResponseEntity<User> responce = new ResponseEntity<User>(this.userservice.Singup(user),HttpStatus.CREATED);
	  return responce;
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody LoginData loginDate) throws UserFoundException {
		ResponseEntity<User> response = new ResponseEntity<User>(this.userservice.login(loginDate.getUname(), loginDate.getUpassword()), HttpStatus.CREATED);
		return response;
	}
}