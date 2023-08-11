package com.dollop.chetan.Service;

import java.util.List;

import com.dollop.chetan.Bean.User;


	public interface UserService {
	  public User createUser(User user) ;
	  public User updateUser(User user);
	  public boolean deleteUser(Integer id);
	  public List<User> getUsers();
	  
	  public User getUserByID(Integer id);
	}


