package com.adda.dollop.service;

import java.util.List;
import java.util.Map;

import com.adda.dollop.bean.Employee;
import com.adda.dollop.bean.Erole;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface EroleService {

	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee (Integer id);
	public List <Employee> getEmployee();
	public Employee getEmployee (Integer id);
	public Map <Integer,String> getMappedRoles();
	
	
}
