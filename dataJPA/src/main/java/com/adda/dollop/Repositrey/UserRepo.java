package com.adda.dollop.Repositrey;

import java.security.cert.CRLSelector;

import org.springframework.data.repository.CrudRepository;

import com.adda.dollop.Bean.User;

public interface UserRepo extends CrudRepository<User, Integer>, CRLSelector {

}
