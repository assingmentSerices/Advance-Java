package com.example.demo.ExcptionHandler;

public class AlbumNotFoundException  extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	public AlbumNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AlbumNotFoundException(String Message) {
		super(Message);
		// TODO Auto-generated constructor stub
	}
}
