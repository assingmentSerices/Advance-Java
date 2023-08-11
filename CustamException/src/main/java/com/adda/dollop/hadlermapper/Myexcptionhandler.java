package com.adda.dollop.hadlermapper;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.adda.dollop.Bean.Employee;
import com.adda.dollop.custom.Custom;

@RestControllerAdvice
public class Myexcptionhandler {
	@ExceptionHandler(Custom.class)
 public  ResponseEntity<Employee> showcustomerrormessge(Custom cs){
	 
 return new ResponseEntity<Employee>(new Employee(new Date().toString(),"exction in prossesing", cs.getMessage(),500),HttpStatus.INTERNAL_SERVER_ERROR);
 
}}
