package com.example.demo.Exception;

public class ResouresNotFoundException  extends RuntimeException{
	public ResouresNotFoundException() {
		super("** Resours Not Found On Server **");
	}
	public ResouresNotFoundException(String Message) {
		super();
		
	}
}
