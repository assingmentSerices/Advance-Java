package com.example.demo.ExcptionHandler;

public class CommentsNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CommentsNotFoundException() {
		super();
	}
	public CommentsNotFoundException(String Message) {
		super(Message);
	}

}
