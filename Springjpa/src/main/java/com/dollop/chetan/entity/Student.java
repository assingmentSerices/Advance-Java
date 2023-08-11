package com.dollop.chetan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//j6tt-c@Table(name="Students")
@Entity
@Data
public class Student {
	
	@Id
private int id;
private String name;
private String email;
	
}
