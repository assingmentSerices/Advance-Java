package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.User;

public interface UserRepo extends JpaRepository<User, Long>{
	public Optional<User> findByUserName(String userName);
	public Optional<User> findByUserNameAndPassword(String UserName,String Password);
	public Optional<User>  findByEmail(String email);
}