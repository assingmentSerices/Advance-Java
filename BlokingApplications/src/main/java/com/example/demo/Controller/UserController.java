package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.User;
import com.example.demo.ExcptionHandler.UserFoundException;
import com.example.demo.Service.UserService;




@RestController
@RequestMapping("/user")
public class UserController{
	@Autowired
	private UserService userservice;
	
	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) throws UserFoundException {
		ResponseEntity<User> response = new ResponseEntity<User>(this.userservice.updateUser(user), HttpStatus.OK);
		return response;
	} 
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserByUserName(@PathVariable Long id) {
		ResponseEntity<String> response=null;
		try {
			response = new ResponseEntity<String>(" user deleted => " +this.userservice.deleteUser(id),
					HttpStatus.OK);
		} catch (UserFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new UserFoundException("User not Found ID : " + id);

		}
		return response;
	}
	
	
	
	
}