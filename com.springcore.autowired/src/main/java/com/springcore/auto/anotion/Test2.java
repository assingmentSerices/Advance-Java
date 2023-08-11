package com.springcore.auto.anotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig2.class);
        Emp2 emp1=(Emp2) context.getBean("emp1",Emp2.class);
        System.out.println(emp1);
	}

}
