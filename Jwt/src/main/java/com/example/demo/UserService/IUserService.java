package com.example.demo.UserService;

import com.example.demo.Bean.User;

public interface IUserService {

	public Integer saveUser(User user);
	public User findByUsername(String username);
}
