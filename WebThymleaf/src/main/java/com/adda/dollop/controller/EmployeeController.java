package com.adda.dollop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adda.dollop.bean.Employee;
import com.adda.dollop.service.EmployeeService;
@Controller

public class EmployeeController {
@SuppressWarnings("unused")
@Autowired
private EmployeeService employeeService;

private static Integer empId=0;
   

      @GetMapping("/page")
	public String viewHomePage(Model model) {
    	return findPaginated(1, model);
    }	
	
    @GetMapping("/showNewEmployeeFrom")
    public String showNewEmployeeFrom(Model model) {
    	Employee employee=new Employee();
    	model.addAttribute("employee",employee);
    	return "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee,Model model) {
   
    	employeeService.saveEmployee(employee);
    
  	model.addAttribute("listEmployee",employeeService.getAllEmployee());
    	return "index"; 
    	
    }
    @GetMapping("/showFromForUpdate/{id}")
    public String showFormUpdate(@PathVariable (value="id")Integer id ,Model model) {
    	
    	Employee employee=this.employeeService.getEmployeeById(id);
    	empId= employee.getId();
    	model.addAttribute("employee",employee);
    	return "update_employee";
    	
    }
    
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id")Integer id,Model model) {
    
    	this.employeeService.deleteEmployeeById(id);
    	model.addAttribute("listEmployee",employeeService.getAllEmployee()); 	
    	return "index";
    }
    	
    	
    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") Employee employee,Model model) {
           employee.setId(empId);
    	employeeService.saveEmployee(employee);
    
  	model.addAttribute("listEmployee",employeeService.getAllEmployee());
    	return "index"; 
    	
    }
    
    
    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "id")int pageNo,Model model) {
    int pagesize=5;
    
    	Page<Employee> page = employeeService.findPaginated(pageNo, pagesize);
    	List<Employee> listEmployee=page.getContent();
    	model.addAttribute("currentPage",pageNo);
    	
    model.addAttribute("totalPages",page.getTotalPages());
    	model.addAttribute("totalItems",page.getTotalElements());
    	model.addAttribute("listEmployee",listEmployee);
    return "index";
    }
}
















