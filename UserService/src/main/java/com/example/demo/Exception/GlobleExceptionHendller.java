package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Payload.ApiResponce;
import com.example.demo.Payload.ApiResponce.ApiResponceBuilder;




@RestControllerAdvice

public class GlobleExceptionHendller {

	@ExceptionHandler(ResouresNotFoundException.class)
	public ResponseEntity<ApiResponce>  handlerResourceNotFoundException(ResouresNotFoundException  ex){
		
	 String message =ex.getMessage();
	 
		ApiResponceBuilder responce = ApiResponce.builder().message(message).successfully(true).status(HttpStatus.NOT_FOUND);
		return  new ResponseEntity<ApiResponce>(HttpStatus.NOT_FOUND);
	}
}
