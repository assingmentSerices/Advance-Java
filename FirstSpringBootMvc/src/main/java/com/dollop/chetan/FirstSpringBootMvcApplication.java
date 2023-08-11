package com.dollop.chetan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dollop.chetan.Bean.Employee;
import com.dollop.chetan.repo.EmpRepo;

@SpringBootApplication
public class FirstSpringBootMvcApplication implements CommandLineRunner{
    @Autowired
	private EmpRepo erepo;
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e = new Employee("chetan","CS");
		Employee e1 =  new Employee("piyush" ,"IT");
	}

}
