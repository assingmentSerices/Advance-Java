package com.adda.dollop.RestControoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/product")
public class EmployeeRest {
@GetMapping("/fetch")
	 public ResponseEntity<String> getProduct(){
		
		 ResponseEntity<String> response = new  ResponseEntity<>("from get product",HttpStatus.OK);
		 return response;
	}
@DeleteMapping("/delete")
public ResponseEntity<String> delete(){
	
	ResponseEntity<String> response = new  ResponseEntity<>("from gets",HttpStatus.OK);
	return response;
}
@PutMapping("/update")
public ResponseEntity<String> update(){
	
	ResponseEntity<String> response = new  ResponseEntity<>("from getss",HttpStatus.OK);
	return response;
}
@PostMapping("/curd")
public ResponseEntity<String> crud(){ 
	
	ResponseEntity<String> response = new  ResponseEntity<>("from getsss",HttpStatus.OK);
	return response;
}
}
