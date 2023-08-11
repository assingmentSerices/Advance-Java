package com.adda.dollop.Bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "`order`")
public class Order {
@Id
	private Integer oid;
	private String oname;
	private String oaddress;
	private String ocity;
	private String ozip;
	private String ostatus;
	private String ocomment;
	private String ototalprice;
	private String otype;
	private String ocreated;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "order")
	private List<OrderItem> orderitem;
	
}
