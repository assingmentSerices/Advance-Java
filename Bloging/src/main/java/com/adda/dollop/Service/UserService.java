package com.adda.dollop.Service;

import com.adda.dollop.Bean.User;

public interface UserService {

User getUserByUserName(String userName);
public User Singup(User user);
public User updateUser(User user);

}
