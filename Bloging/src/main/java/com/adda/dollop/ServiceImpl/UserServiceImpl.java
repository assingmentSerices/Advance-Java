package com.adda.dollop.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.User;
import com.adda.dollop.Repo.UserRepo;
import com.adda.dollop.Service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
	private UserRepo userrepo;

@Override
public User getUserByUserName(String userName) {
	User user = userrepo.findByUserName(userName);
	if(user!=null) {
	return user;
	}

	return null;
}

@Override
public User Singup(User user) {
	// TODO Auto-generated method stub
	return this.userrepo.save(user);
}

@Override
public User updateUser(User user) {
	// TODO Auto-generated method stub
	return this.userrepo.save(user);
}


	
}
	
	  
	


