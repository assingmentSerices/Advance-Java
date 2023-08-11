package com.adda.dollop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.dollop.Bean.product;
import com.adda.dollop.custom.Custom;
import com.adda.dollop.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
private	EmployeeService service;
	@GetMapping("/{id}")
 public ResponseEntity<product> getproductByid(@PathVariable("id")Integer id){
	 ResponseEntity<product> responce=null;
	 try
	 {
		 product pob = service.getoneproduct(id);
		 responce=new ResponseEntity<product>(pob,HttpStatus.OK);
	 }
	 catch ( Custom enfes) {
	enfes.printStackTrace();
	throw enfes;// TODO: handle exception
	}
	 return responce;
 }
}
