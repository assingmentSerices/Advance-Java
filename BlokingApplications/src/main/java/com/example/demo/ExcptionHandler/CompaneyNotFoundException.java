package com.example.demo.ExcptionHandler;

public class CompaneyNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public CompaneyNotFoundException() {
		super();
	}
	public CompaneyNotFoundException(String Message) {
		super(Message);
	}
}
