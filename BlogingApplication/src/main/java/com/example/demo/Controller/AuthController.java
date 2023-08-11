package com.example.demo.Controller;

import java.com.example.demo.ExcptionHandler.UserFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.UserService;
import com.explane.demo.Bean.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserService userservice;
	
	public ResponseEntity<User> singup(@RequestBody User user)throws UserFoundException{
		ResponseEntity<User> responce=new ResponseEntity<User>(this.userservice.Singup(user),HttpStatus.CREATED);
		return responce;
	}
}