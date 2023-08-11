package com.example.demo.Impl;

import java.com.example.demo.ExcptionHandler.UserFoundException;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;
import com.explane.demo.Bean.User;



public class UserServiceImpl  implements UserService {
	@Autowired
private UserRepo userrepo;

	@Override
	public UserRepo getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User Singup(User user) {
		// TODO Auto-generated method stub
		try {
			return this.userrepo.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserFoundException("UserName Already exists") ;
		}
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	




	
}
	
	  
	


