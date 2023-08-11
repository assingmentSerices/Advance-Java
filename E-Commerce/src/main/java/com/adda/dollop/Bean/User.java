package com.adda.dollop.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer uid;
private String uname;
private String uemail;
private String udate;
private String utoken;
private String upassword;

	
}
