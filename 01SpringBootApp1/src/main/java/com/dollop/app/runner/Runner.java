package com.dollop.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.dollop.app.bean.user;
@Component
@Profile(value = { "dev" })
public class Runner implements CommandLineRunner {
    @Autowired
    private user User2;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
    	System.out.println("Runner");
    	System.out.println(User2);

	}

}
