package com.adda.dollop.Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="Student")
public class Student {
public Student(String sname, String slocation) {
		super();
		this.sname = sname;
		this.slocation = slocation;
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="s_id")
	private Integer sid;
@Column(name="s_name")
	private String sname;
@Column(name="s_location")
	private String slocation;
}
