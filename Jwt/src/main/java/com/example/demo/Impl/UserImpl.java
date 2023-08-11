package com.example.demo.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.UserService.IUserService;
@Service
public class UserImpl implements IUserService {

	@Autowired
	private UserRepo repo;
	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		Optional<User>opt = repo.findByUserName(username);
		return null;
	}

}
