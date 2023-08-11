package com.example.demo.Service;


import java.util.List;
import java.util.Optional;

import com.example.demo.Bean.Album;
import com.example.demo.Bean.Posts;
import com.example.demo.Bean.User;
import com.example.demo.ExcptionHandler.UserFoundException;
import com.example.demo.Repo.UserRepo;






public interface UserService {

UserRepo  getUserByUserName(String userName);

public User login(String username,String password) throws UserFoundException;


public User Singup(User user) throws Exception;

public User updateUser(User user);

public List<User> getAllUsers();

public Boolean deleteUser(Long id);

public List<Posts> getPostsOfUser(String userName);

public List<Album> getAlbumsOfUser(String userName);

public String checkUsernameAvailability(String userName);

public String checkEmailAvailability(String email);

}
