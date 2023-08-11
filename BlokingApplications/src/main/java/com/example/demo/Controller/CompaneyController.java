package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Companey;
import com.example.demo.Service.CompaneyService;

import net.bytebuddy.asm.Advice.This;



@RestController
@RequestMapping("/companey")
public class CompaneyController {
@SuppressWarnings("unused")
@Autowired
	private CompaneyService companeyservice;

@PostMapping("/save")
public ResponseEntity<Companey> addCompany(@RequestBody Companey company) {
	ResponseEntity<Companey> response = new ResponseEntity<Companey>(this.companeyservice.addCompaney(company),HttpStatus.CREATED);
	return response;
}

@GetMapping("/{id}")
public ResponseEntity<Companey> getCompany(@PathVariable Long id) throws Exception {
	ResponseEntity<Companey> response = new ResponseEntity<Companey>(this.companeyservice.getCompaneyById(id),HttpStatus.OK);
	return response;
}
}
