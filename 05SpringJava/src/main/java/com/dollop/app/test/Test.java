package com.dollop.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dollop.app.bean.DriverManager;
import com.dollop.app.config.MyAppConfig;
import com.dollop.app.service.DriverManageServicer;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		DriverManageServicer dob=ac.getBean("dbs",DriverManageServicer.class);
				System.out.println(dob);
	}

}
