package com.adda.dollop;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adda.dollop.Bean.User;
import com.adda.dollop.Repositrey.UserRepo;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		    ApplicationContext context=(ApplicationContext) SpringApplication.run(DataJpaApplication.class, args);
		    UserRepo userrepo=((BeanFactory) context).getBean(UserRepo.class);
		    User user=new User();
		    user.setLocation("Mandleshwar");
		    user.setDepartment("Computer Science");
		    user.setName("Chetan Kushwah");
		    
		 User user1  =userrepo.save(user);
		 System.out.println(user);
	}

}
