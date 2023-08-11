package com.adda.dollop.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.Employee;
import com.adda.dollop.Repo.EmpRepo;
import com.adda.dollop.Service.EmployeeService;
@Service
public class ServiceImpl implements EmployeeService {
@Autowired
  public EmpRepo emprepo;
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  this.emprepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return this.emprepo.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		this.emprepo.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return this.emprepo.findAll();
	}

}
