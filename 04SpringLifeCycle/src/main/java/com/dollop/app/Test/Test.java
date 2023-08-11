package com.dollop.app.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dollop.app.bin.ExelExportServies;

public class Test {
public Test() {
	
}
public  static void main(String[] args)
{
	ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("confic.xml");
	ExelExportServies eob=ac.getBean("eob",ExelExportServies.class);
	System.out.println(eob);
	ac.close();
};
}
