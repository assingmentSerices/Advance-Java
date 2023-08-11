package com.dollop.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.app.bean.user;

@Component
public class TestingRunner implements CommandLineRunner {
	@Autowired
	private user name;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(name);
	}

}
