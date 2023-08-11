package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {

      User saveUser(User user)	;
      List <User> getAllUser();
      User getUser(String Userid);
      User deleteById(User id);
      User updateUser(User user);
	
}
