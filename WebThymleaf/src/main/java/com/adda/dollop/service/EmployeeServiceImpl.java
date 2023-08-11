package com.adda.dollop.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.adda.dollop.bean.Employee;
import com.adda.dollop.repository.EmployeeRepository;
@Service

public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		this.employeeRepository.save(employee); 
	}
	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Employee> optional=employeeRepository.findById(id);
		Employee employee =null;
		if(optional.isPresent()) {
		employee=optional.get();
		
		}
		else {
			throw new RuntimeException("not found");
		}
		return employee;
	}
	@Override
	public void deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteById(id);
		
	}
	@Override
	public Page<Employee> findPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return this.employeeRepository.findAll(pageable);
	}
	
	}
	
	
	
	 
 

