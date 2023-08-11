package com.dollop.chetan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dollop.chetan.entity.Student;

@SpringBootApplication
public class SpringjpaApplication {
	
	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringjpaApplication.class, args);
		IStudentRepo std =ac.getBean(IStudentRepo.class); 
		Student st = new Student();
		      st.setId(2 );
		      st.setName("Chetan kush");
		      st.setEmail("chetan@1234");
		      std.save(st);
		     System.out.println(st);
	}

}
