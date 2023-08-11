package com.example.demo.ExcptionHandler;

public class PhotosNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public PhotosNotFoundException() {
		super();
	}
	public PhotosNotFoundException(String Message) {
		super(Message);
	}
}
