package com.adda.dollop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adda.dollop.Bean.User;
import com.adda.dollop.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
private UserService userservice;
	
@PostMapping("/login/{uname}/{upassword}")
	public ResponseEntity<User> loginUser(@PathVariable("uname") String uname,@PathVariable("upassword") String upassword){
		ResponseEntity<User> response = new ResponseEntity<User>(this.userservice.loginUser(uname, upassword),HttpStatus.OK);
		return response;
	}
	
@PostMapping("/save")
	public ResponseEntity<User> addUser(@RequestBody User user){
		ResponseEntity<User> response = new ResponseEntity<User>(this.userservice.createEmployee(user),HttpStatus.CREATED);
	  return response;
	}

@PutMapping("/update")
 public ResponseEntity<User>updateUser(@RequestBody User user){
	ResponseEntity<User>responce = new ResponseEntity<User>(this.userservice.updateEmployee(user),HttpStatus.OK);
	return responce;
	
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
	
	this.userservice.deleteEmployee(id);
	ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
	return response;
}

}


