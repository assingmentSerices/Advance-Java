package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.Bean.User;


public interface UserRepo extends JpaRepository<User, Long> {
public  User findByUserName(String  username);
}
