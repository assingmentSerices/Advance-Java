package com.app.bean;

public class Test {
private String Employee_Dep;
private String  Employee_Gender;
private String Employee_Location;
public String getEmployee_Dep() {
	return Employee_Dep;
}
public void setEmployee_Dep(String employee_Dep) {
	Employee_Dep = employee_Dep;
}
public String getEmployee_Gender() {
	return Employee_Gender;
}
public void setEmployee_Gender(String employee_Gender) {
	Employee_Gender = employee_Gender;
}
public String getEmployee_Location() {
	return Employee_Location;
}
public void setEmployee_Location(String employee_Location) {
	Employee_Location = employee_Location;
}
public Test() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Test [Employee_Dep=" + Employee_Dep + ", Employee_Gender=" + Employee_Gender + ", Employee_Location="
			+ Employee_Location + "]";
}


}
