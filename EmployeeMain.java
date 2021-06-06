package com.ltts;

class Employee{
private String name;
private String address;
private String mobile;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String string) {
	this.mobile = string;
}
}
public class EmployeeMain{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Ravi");
		e.setAddress("Pune");
		e.setMobile("9998887771");
		System.out.println("Employee Details\n" +"Name\n"+ e.getName()+ "\nAddress:\n"  +e.getAddress() + "\nMobile:\n" + e.getMobile());
	}
}



