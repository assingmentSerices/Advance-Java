package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Child implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Child [price=" + price + "]";
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet()  {
		// TODO Auto-generated method stub
		System.out.println("taking");
	}
     
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("hiii");
	}
	

}
