package com.dollop.chetan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dollop.chetan.Bean.User;
import com.dollop.chetan.Repo.UserRapo;

@SpringBootApplication
public class WebmbApplication implements CommandLineRunner{
	@Autowired
	private UserRapo urapo;
	
	public static void main(String[] args) {
		SpringApplication.run(WebmbApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u = new  User("Bhopal","Chetan");
		User u1= new User("Indore","Piyush");
		User u2=new User ("Mandleshwar","Akul");
		User u3 =new User("Maheshwer","Aabhay");
		urapo.save(u);
		urapo.save(u1);
		urapo.save(u2);
		urapo.save(u3);
	}

}
