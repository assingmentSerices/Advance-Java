package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
