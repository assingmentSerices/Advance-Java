package com.example.demo.appconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
@Autowired
private BCryptPasswordEncoder passwordEncoder;
@Autowired
private UserDetailsService detailsService;
   


public AuthenticationManager authenticationManager() {
	AuthenticationConfiguration authconfig)
throw Exception{
	
}
		
		
}
	
	
	
}
