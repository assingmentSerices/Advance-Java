package com.adda.dollop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
Config c =ac.getBean(" config",Config.class);
c.generteDate();
	}

}
