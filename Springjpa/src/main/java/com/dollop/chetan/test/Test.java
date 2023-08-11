/**
 * 
 */
package com.dollop.chetan.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.dollop.chetan.IStudentRepo;
import com.dollop.chetan.entity.Student;

/**
 * @author mahakaal
 *
 */
public class Test implements CommandLineRunner {
   @Autowired
	IStudentRepo std;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
   
	}

}
