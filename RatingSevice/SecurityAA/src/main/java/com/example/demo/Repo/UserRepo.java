package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	Optional<User>findByUserEmail(String userEmail);

}
