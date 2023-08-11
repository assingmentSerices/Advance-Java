package com.dollop.chetan.Bean;




	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	@Data
	@Entity
	@NoArgsConstructor
	@AllArgsConstructor
	@Table(name = "User")
	public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
		private Integer u_id;
	@Column(name = "u_name")
		private String u_name;
	@Column(name = "u_address")
		private String u_address;
	@Column(name = "u_mobile")
		private Integer u_mobile;
		
		
	}


