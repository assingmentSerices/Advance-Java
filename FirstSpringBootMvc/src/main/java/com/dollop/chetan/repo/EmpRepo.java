package com.dollop.chetan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.chetan.Bean.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
