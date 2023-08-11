package com.app.bin;

public class Employee 
{
private Integer Emp_Id;
private String Emp_Name;
private String Emp_Salarey;
private String Emp_Gendar;
private String Emp_Dep;
public Integer getEmp_Id() {
	return Emp_Id;
}
public void setEmp_Id(Integer emp_Id) {
	Emp_Id = emp_Id;
}
public String getEmp_Name() {
	return Emp_Name;
}
public void setEmp_Name(String emp_Name) {
	Emp_Name = emp_Name;
}
public String getEmp_Salarey() {
	return Emp_Salarey;
}
public void setEmp_Salarey(String emp_Salarey) {
	Emp_Salarey = emp_Salarey;
}
public String getEmp_Gendar() {
	return Emp_Gendar;
}
public void setEmp_Gendar(String emp_Gendar) {
	Emp_Gendar = emp_Gendar;
}
public String getEmp_Dep() {
	return Emp_Dep;
}
public void setEmp_Dep(String emp_Dep) {
	Emp_Dep = emp_Dep;
}
@Override
public String toString() {
	return "Employee [Emp_Id=" + Emp_Id + ", Emp_Name=" + Emp_Name + ", Emp_Salarey=" + Emp_Salarey + ", Emp_Gendar="
			+ Emp_Gendar + ", Emp_Dep=" + Emp_Dep + ", getEmp_Id()=" + getEmp_Id() + ", getEmp_Name()=" + getEmp_Name()
			+ ", getEmp_Salarey()=" + getEmp_Salarey() + ", getEmp_Gendar()=" + getEmp_Gendar() + ", getEmp_Dep()="
			+ getEmp_Dep() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
