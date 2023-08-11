package com.example.demo.ExcptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class MyCustomException {
	@ExceptionHandler(UserFoundException.class)
	public ResponseEntity<MyErrorResponce> showCustomErrorMsg(UserFoundException pnfe){
		
		return new ResponseEntity<MyErrorResponce>(new MyErrorResponce(new Date().toString(),"Exception in process",pnfe.getMessage(),500),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(PostsNotFoundException.class)
	public ResponseEntity<MyErrorResponce> showCustomErrorMsg(PostsNotFoundException pnfe){
		
		return new ResponseEntity<MyErrorResponce>(new MyErrorResponce(new Date().toString(),"Exception in process",pnfe.getMessage(),500),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(TodosNotFoundException.class)
	public ResponseEntity<MyErrorResponce> showCustomErrorMsg(TodosNotFoundException pnfe){
		
		return new ResponseEntity<MyErrorResponce>(new MyErrorResponce(new Date().toString(),"Exception in process",pnfe.getMessage(),500),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(AlbumNotFoundException.class)
	public ResponseEntity<MyErrorResponce> showCustomErrorMsg(AlbumNotFoundException pnfe){
		
		return new ResponseEntity<MyErrorResponce>(new MyErrorResponce(new Date().toString(),"Exception in process",pnfe.getMessage(),500),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(CommentsNotFoundException.class)
	public ResponseEntity<MyErrorResponce> showCustomErrorMsg(CommentsNotFoundException pnfe){
		
		return new ResponseEntity<MyErrorResponce>(new MyErrorResponce(new Date().toString(),"Exception in process",pnfe.getMessage(),500),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
