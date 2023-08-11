package com.app.autowired;

public class Emp {
private Address address;


public Address getAddress() {
	return address;
}

public Emp(Address address) {
	super();
	this.address = address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}
