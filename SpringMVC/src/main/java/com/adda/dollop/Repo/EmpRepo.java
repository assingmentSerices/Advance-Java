package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.Bean.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
