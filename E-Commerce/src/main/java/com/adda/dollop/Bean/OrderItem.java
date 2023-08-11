package com.adda.dollop.Bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "`orderitem`")
public class OrderItem {
@Id
	private Integer iid;
	private String iprice;
	@ManyToOne(cascade = CascadeType.ALL)
	private Order order;
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	@ManyToOne
	private GroupVariant groupvariant;
}
