package com.adda.dollop.Bean;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String cachePharse;
	
	private String bs;
	
	  @CreationTimestamp
private Timestamp createdAt;
	@UpdateTimestamp
	private Timestamp updatedAt;	
	
	private Long createdBy;
	
	private Long updatedBy;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	@JsonIgnoreProperties("company")
	private List<User> users;
   
}



