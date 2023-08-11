package com.dollop.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.dollop.app.bean.user;
@Component
@Profile(value = { "qa" })
public class Runner2 implements CommandLineRunner {
	
@Autowired
private user User;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stu
		System.out.println("runner2");
		System.out.println(User);

		
		
		
		
		
		
		
		
		
		
		
	}

}
