package com.adda.dollop.Bean;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Geo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	
	private String lat;
	
	private String lng;
	
private Timestamp createdAt;

private Timestamp updatedAt;	

private Long createdBy;
private Long updatedBy;

}

