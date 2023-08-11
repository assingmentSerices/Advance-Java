package com.example.demo.ExcptionHandler;

public class TodosNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public TodosNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TodosNotFoundException(String Message) {
		super(Message);
		// TODO Auto-generated constructor stub
	}
}
