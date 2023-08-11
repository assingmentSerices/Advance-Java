package com.adda.dollop.Bean;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	 private String name;
	 
	 private String email;
	 
	 private String body;
	 
	 @ManyToOne
	 private Posts post;
	 
	 @ManyToOne
	 private User user;
	 
     @CreationTimestamp
     private Timestamp createdAt;
     
     @UpdateTimestamp
	 private Timestamp updatedAt;

	 private Long createdBy;
	 private Long updatedBy;
}


	

