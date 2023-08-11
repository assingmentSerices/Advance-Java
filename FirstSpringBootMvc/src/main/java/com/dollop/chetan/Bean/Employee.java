package com.dollop.chetan.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer empid;
	 private String empname;
	 private String empDepart;
	public Employee(String empname, String empDepart) {
		super();
		this.empname = empname;
		this.empDepart = empDepart;
	}
	 
}
