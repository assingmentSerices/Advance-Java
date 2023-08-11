package com.dollop.app.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dollop.app.bean.Token;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("confic.xml");
   Token tob1=ac.getBean("tob",Token.class);
    System.out.println(tob1.hashCode());
    Token tob2=ac.getBean("tob",Token.class);
    System.out.println(tob2.hashCode());
	 
	}

}

