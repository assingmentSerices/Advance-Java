package com.example.demo.Service;


import com.example.demo.Repo.UserRepo;
import com.explane.demo.Bean.User;

public interface UserService {

UserRepo  getUserByUserName(String userName);
public User Singup(User user);
public User updateUser(User user);

}
