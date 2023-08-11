package com.adda.dollop.RestController;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.dollop.bean.Employee;
import com.adda.dollop.service.EroleService;
@RestController
@RequestMapping("/user")
public class EmployeeRestController {

	@Autowired
	private EroleService eroleSerivce;
	
@PostMapping("/save")
public ResponseEntity<Employee> addUser(@RequestBody Employee employee){
	ResponseEntity<Employee> response = new ResponseEntity<Employee>(this.eroleSerivce.createEmployee(employee),HttpStatus.CREATED);
  return response;
}

@GetMapping
public ResponseEntity<List<Employee>> getUsers(){
	
	ResponseEntity<List<Employee>> response = new ResponseEntity<List<Employee>>(this.eroleSerivce.getEmployee(),HttpStatus.OK);
	return response; 
}

@GetMapping("/{id}")
public ResponseEntity<Employee> getUser(@PathVariable("id") Integer id){
	ResponseEntity<Employee> response = new ResponseEntity<Employee>(this.eroleSerivce.getEmployee(id),HttpStatus.OK);
	return response;
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
	
	
	
	this.eroleSerivce.deleteEmployee(id);
	ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
	return response;
}

@PutMapping("/update")
public ResponseEntity<Employee> updateUser(@RequestBody Employee employee){
	ResponseEntity<Employee> response = new ResponseEntity<Employee>(this.eroleSerivce.createEmployee(employee),HttpStatus.OK);
	return response;
}

@GetMapping("/roles")
public ResponseEntity<Map<Integer, String>> getMappedRoles(){
	ResponseEntity<Map<Integer,String>> response = new ResponseEntity<Map<Integer,String>>(this.eroleSerivce.getMappedRoles(),HttpStatus.OK);
			return response;
}


}
