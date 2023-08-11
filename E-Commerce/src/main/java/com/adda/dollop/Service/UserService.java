package com.adda.dollop.Service;

import com.adda.dollop.Bean.User;


public interface UserService {
	public User createEmployee(User user);
	public User updateEmployee(User user);
	public boolean deleteEmployee (Integer id);
	User loginUser(String uname , String upassword);
}
