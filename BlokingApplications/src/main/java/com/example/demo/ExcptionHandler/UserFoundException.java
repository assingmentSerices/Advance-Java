package com.example.demo.ExcptionHandler;

public class UserFoundException extends RuntimeException {
	public UserFoundException() {
		super();
	}
	public UserFoundException(String Message) {
		super(Message);
	}
}
