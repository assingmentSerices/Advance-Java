package com.dollop.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.dollop.app.bean.DriverManager;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("com.dollop.app")
@Scope("com.dollop.app")
public class MyAppConfig {
//1 method =1 object
	@Autowired
	 private Environment env;
	@Bean
	public DriverManager conObj()
	{
		DriverManager dm= new DriverManager();
		dm.setDriverClass(env.getProperty("my.driver-class"));
		dm.setUrl(env.getProperty("my.url"));
		return dm;
	}
	
}
