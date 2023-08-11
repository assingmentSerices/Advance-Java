package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
   @SuppressWarnings("resource")
  
	
  AbstractApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Confic.xml");
   context.registerShutdownHook();
   User u1=(User) context.getBean("u1");
   System.out.println( u1);

     
	
	}

}
