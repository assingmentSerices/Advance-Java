package com.adda.dollop.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.adda.dollop.bean.Employee;

public interface EmployeeService {
List<Employee>getAllEmployee();
void saveEmployee(Employee employee);
Employee getEmployeeById(Integer id);
void deleteEmployeeById(Integer id);
Page<Employee> findPaginated(int pageNo,int pageSize);
}
