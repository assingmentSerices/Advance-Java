package com.adda.dollop.Bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	private  String pname;
	private String pcreated;
	private String pprice;
	private String pdescription;
	@ManyToOne(cascade = CascadeType.ALL)
	private GroupProduct groupproduct;
	
}
