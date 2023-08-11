package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.dollop.Bean.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
@Query("select u from User u where u.uname=?1 And u.upassword=?2 ")	
 public User loginByUser(String uname,String upassword);

  
}
