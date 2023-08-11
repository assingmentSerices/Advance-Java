package com.example.demo.ExcptionHandler;

public class PostsNotFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PostsNotFoundException() {
		super();
	}
	public PostsNotFoundException(String Message) {
		super(Message);
	}

}
