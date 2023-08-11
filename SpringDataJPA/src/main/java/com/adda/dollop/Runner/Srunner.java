package com.adda.dollop.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.dollop.Bean.Student;
import com.adda.dollop.Repo.StudentRepo;
@Component

public class Srunner implements CommandLineRunner {
@Autowired
  private StudentRepo sro;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Student student =new Student();
		sro.saveAll(Arrays.asList(
				new Student ("Vishal","Indore"),
				new Student ("Chetan","Bhopal"),
				new Student ("Piyush","Mandleshwar"),
				new Student ("Deepak","Maheshwar"),
				new Student ("Vishal","Indore")
				
				
				));
	//	sro.save(student);
		         System.out.println(sro);

	}*/

		
		
			//sro.findBySname("vishal").forEach(System.out::println);
		sro.findbysidBetween(1,20).forEach(System.out::println);
			
		
}
}