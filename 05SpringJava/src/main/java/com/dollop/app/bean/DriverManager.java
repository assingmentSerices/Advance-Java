package com.dollop.app.bean;

public class DriverManager {
private String driverClass;
private String url;
public DriverManager() {
	super();
	// TODO Auto-generated constructor stub
}
public String getDriverClass() {
	return driverClass;
}
public void setDriverClass(String driverClass) {
	this.driverClass = driverClass;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return "DriverManager [driverClass=" + driverClass + ", url=" + url + "]";
}


}
