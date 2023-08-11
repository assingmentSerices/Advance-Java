package com.example.demo.Impl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException; 
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Album;
import com.example.demo.Bean.Posts;
import com.example.demo.Bean.User;
import com.example.demo.ExcptionHandler.UserFoundException;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;





@Service
public  class UserImpl implements UserService{
	@Autowired
	private UserRepo Userrepo;

	@Override
	public UserRepo getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User Singup(User user) {
		// TODO Auto-generated method stub
		try {
			return this.Userrepo.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  UserFoundException("UserName Already exists");
			
		}
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		try {
			if (this.Userrepo.existsById(user.getId()))
				return this.Userrepo.save(user);

		} catch (DataAccessException e) {

			throw new UserFoundException("User Name ALready exits: ");
		}
		throw new  UserFoundException("User Not Found id: " + user.getId());
		
	}



	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.Userrepo.findAll();
	}

	@Override
	public Boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		if (this.Userrepo.existsById(id)) {
			this.Userrepo.deleteById(id);
			return true;
		}
		throw new UserFoundException("User not Found ID : " + id);

	}

	@Override
	public List<Posts> getPostsOfUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Album> getAlbumsOfUser(String userName) {
		// TODO Auto-generated method stub
		Optional<User> user = this.Userrepo.findByUserName(userName);
		if (user.isPresent())
			return user.get().getAlbums();
		throw new UserFoundException("User not found with userName : " + userName);
	
	}

	@Override
	public String checkUsernameAvailability(String userName) {
		// TODO Auto-generated method stub
		Optional<User> user = this.Userrepo.findByUserName(userName);
		return user.isPresent() ? "Availability : false" : "Availability : true";
	
	}

	@Override
	public String checkEmailAvailability(String email) {
		// TODO Auto-generated method stub
		Optional<User> user = this.Userrepo.findByEmail(email);
		return user.isPresent() ? "Availability : false" : "Availability : true";
	}

	

	@Override
	public User login(String username, String password) throws UserFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = this.Userrepo.findByUserNameAndPassword(username, password);
		if (user.isPresent())
			return user.get();
		throw new UserFoundException();

	}
	


}