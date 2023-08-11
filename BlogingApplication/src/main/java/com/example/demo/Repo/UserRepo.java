package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.explane.demo.Bean.User;

public interface UserRepo  extends JpaRepository<User, Integer> {

	
	

}
