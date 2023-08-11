package com.example.demo.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;
@Service
public class UserImpl implements UserService,UserDetailsService {
	@Autowired
private UserRepo userrepo;
	private BCryptPasswordEncoder passwordEncoder;
	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		String encPwd=passwordEncoder.encode(user.getUPassword();
		return userrepo.save(user).getUid();
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User>opt=userrepo.findByUserEmail(username);
		if(opt.isEmpty()) {
			throw new UsernameNotFoundException(username+"not Expection");
		}
		User user =opt.get();
		List<GrantedAothority> authorities=user.getURole();
		
		return null;
	}

	
}
