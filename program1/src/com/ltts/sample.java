package com.ltts;
import java.util.Scanner;

class Employee {
String name;
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
public void setMobile(String mobile) {
	this.mobile = mobile;
}
String address;
String mobile;
}
 class EmployeeMain{
	public static void main(String[] args) {
		Employee s=new Employee();
		s.name="Name:Ravi";
		s.address="Address:Pune";
		s.mobile="Mobile:9998887771";
		System.out.println(s.name);
		System.out.println(s.address);
		System.out.println(s.mobile);
		
		
	}
}