package com.dollop.chetan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.chetan.Bean.User;

public interface UserRepo extends JpaRepository<User, Integer> 
{

	
	
}
