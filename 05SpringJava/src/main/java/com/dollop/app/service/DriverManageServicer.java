package com.dollop.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.dollop.app.bean.DriverManager;
@Component("dbs")
public class DriverManageServicer  {
	@Autowired
	DriverManager con;

	@Override
	public String toString() {
		return "DriverManageer [con=" + con + "]";
	}
	
}
