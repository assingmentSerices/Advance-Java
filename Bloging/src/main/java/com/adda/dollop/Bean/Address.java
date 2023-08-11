package com.adda.dollop.Bean;
import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	
	private String street;
	
	private String suite;
	
	private String city;
	
	private String zipCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="geo_id")
	private Geo geo;
	@CreationTimestamp
private Timestamp createdAt;
	
	private Timestamp updatedAt;	
	
	private Long createdBy;
	private Long updatedBy;
}
