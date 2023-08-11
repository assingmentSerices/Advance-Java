package com.example.demo.Bean;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="usertable")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="uid")
	private Integer Uid;
@Column(name = "uname")
private String UName;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getUid() {
	return Uid;
}
public void setUid(Integer uid) {
	Uid = uid;
}
public String getUName() {
	return UName;
}
public void setUName(String uName) {
	UName = uName;
}
public String getUEmail() {
	return UEmail;
}
public void setUEmail(String uEmail) {
	UEmail = uEmail;
}
public String getUPassword() {
	return UPassword;
}
public void setUPassword(String uPassword) {
	UPassword = uPassword;
}
public Set<String> getURole() {
	return URole;
}
public void setURole(Set<String> uRole) {
	URole = uRole;
}
@Column(name = "uemail")
private String UEmail;
@Column(name = "upassword")
private String UPassword;
@Column(name = "urole")
@ElementCollection
@CollectionTable(name= "URole")
@JoinColumn(name="u_id")
private  Set <String> URole;
}
