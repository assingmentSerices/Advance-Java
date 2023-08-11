package com.adda.dollop.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Repo.EmployeeRepo;
import com.adda.dollop.bean.Employee;
import com.adda.dollop.service.EroleService;

@Service
public class EmployeeImpl implements EroleService{
	
	@Autowired
	private EmployeeRepo emprepo;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return this.emprepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return this.emprepo.save(employee);
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		this.emprepo.deleteById(id);
		return true;
		
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return this.emprepo.findAll();
	}

	
	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return this.emprepo.findById(id).get();
	}

	@Override
	public Map<Integer, String> getMappedRoles() {
		
			List<Employee> list = this.emprepo.findAll();
			Map<Integer,String> map = new HashMap<>();
			list.forEach(l->{
				map.put(l.getId(), l.getRole().getRname());
				
			});
			return map;
		}
	}


