package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "micro_user")
public class User {
	@Id
	@Column(name="ID")
	private String userid;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email", length = 23)
	private String email;
	
	@Column(name="About")
	private String about;
@Transient
	private List<Rating> rating= new ArrayList<>();
	
}
