package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/confic.xml");
  EMp emp1=(EMp) context.getBean("emp1");
  System.out.println(emp1);
	}

}
