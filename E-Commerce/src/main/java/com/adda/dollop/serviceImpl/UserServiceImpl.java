package com.adda.dollop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.User;
import com.adda.dollop.Repo.UserRepo;
import com.adda.dollop.Service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
	
	private  UserRepo repo;
	@Override
	public User createEmployee(User user) {
		// TODO Auto-generated method stub
		return this.repo.save(user);
	}

	@Override
	public User updateEmployee(User user) {
		// TODO Auto-generated method stub
		return this.repo.save(user);
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User loginUser(String uname, String upassword) {
		
		User user =this.repo.loginByUser(uname, upassword);
		
		if(user!=null) 
			return user;
		else
			return null;
	}
	
	
	

}
