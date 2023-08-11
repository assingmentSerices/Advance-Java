package com.adda.dollop.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Address")
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer Hno;
private String  Hlocation;
	
}
