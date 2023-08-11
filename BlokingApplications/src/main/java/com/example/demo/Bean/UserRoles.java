package com.example.demo.Bean;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Roles role;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="u_id")
    @JsonBackReference

	private User user;
}
