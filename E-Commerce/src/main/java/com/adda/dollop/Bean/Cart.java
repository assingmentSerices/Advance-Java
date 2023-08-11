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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer cid;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cproid")
private List <CartItem> cartitem;

}
