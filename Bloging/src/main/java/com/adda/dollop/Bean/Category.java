package com.adda.dollop.Bean;
import java.util.List;

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
public class Category {
	  @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
	   private String name;
	   
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="category_id")
		private List<Posts> posts; 

}
