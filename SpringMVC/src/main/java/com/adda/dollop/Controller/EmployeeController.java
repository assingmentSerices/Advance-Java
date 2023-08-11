package com.adda.dollop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.dollop.Bean.Employee;
import com.adda.dollop.Service.EmployeeService;

@RestController
@RequestMapping("/user")
public class EmployeeController {
@Autowired
private EmployeeService employeeservice;

@PostMapping("/save")
public ResponseEntity<Employee> addEMployee(@RequestBody Employee employee){
	ResponseEntity<Employee> response = new ResponseEntity<Employee>(this.employeeservice.createEmployee(employee),HttpStatus.CREATED);
  return response;
}
@PutMapping("/update")
public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee){
	ResponseEntity<Employee> responce = new ResponseEntity<Employee>(this.employeeservice.updateEmployee(employee),HttpStatus.CREATED);
	return responce;
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
	this.employeeservice.deleteEmployee(id);
	ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
	return response;
}
 
@GetMapping
public ResponseEntity<List<Employee> >getEmployee()
{
	ResponseEntity<List<Employee>> response = new ResponseEntity<List<Employee>>(this.employeeservice.getAllEmployee(),HttpStatus.OK);
	return response;
}

}
