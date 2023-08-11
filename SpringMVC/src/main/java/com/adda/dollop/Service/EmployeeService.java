package com.adda.dollop.Service;

import java.util.List;

import com.adda.dollop.Bean.Employee;

public interface EmployeeService {

public Employee createEmployee(Employee employee);
public Employee updateEmployee(Employee employee);
public  void deleteEmployee(Integer id);
public List<Employee> getAllEmployee();
	
	
	
}
