package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.Bean.User;

public interface UserService {

	Integer saveUser(User user);
	Optional<User>getOneUser(Integer id);
	
	
	
	
}
