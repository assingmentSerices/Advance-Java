package com.adda.dollop.Bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GroupVariant {
	@Id
	private String gvid;
private String  gvname;
@ManyToOne(cascade = CascadeType.ALL)
private GroupProduct groupproduct;
}
