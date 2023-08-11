package com.dollop.app.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.db")
public class user {

	private String name;

	private String url;
	private String password;

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getUrl() {
//		return url;
//	}
//	public void setUrl(String url) {
//		this.url = url;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public Bean(String name, String url, String password) {
//		super();
//		this.name = name;
//		this.url = url;
//		this.password = password;
//	}
//	@Override
//	public String toString() {
//		return "Bean [name=" + name + ", url=" + url + ", password=" + password + "]";
//	}
//	public Bean() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

}
