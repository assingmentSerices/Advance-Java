package com.app.autowired;

public class Address {
private String street;
private String citty;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCitty() {
	return citty;
}
public void setCitty(String citty) {
	this.citty = citty;
}
@Override
public String toString() {
	return "Address [street=" + street + ", citty=" + citty + "]";
}

}
