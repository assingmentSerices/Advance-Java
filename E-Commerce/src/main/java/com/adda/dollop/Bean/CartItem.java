package com.adda.dollop.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItem {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cproid;
	private Integer cvarid;
	private String cquantity;
}
