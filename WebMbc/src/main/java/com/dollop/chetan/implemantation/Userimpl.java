package com.dollop.chetan.implemantation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dollop.chetan.Bean.User;
import com.dollop.chetan.Repo.UserRepo;
import com.dollop.chetan.Service.UserService;

@Component
public class Userimpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepo.save(user);
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		 this.userRepo.deleteById(id);
		 return true;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return this.userRepo.findAll();
	}

	@Override
	public User getUserByID(Integer id) {
		Optional<User> user = this.userRepo.findById(id);
		if(user.isPresent())
		return user.get();
		return null;
	}
 

}
