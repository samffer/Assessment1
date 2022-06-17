package com.cogent.day13Generics;

import java.time.LocalDate;

public class Employee {
	
	public Employee(int empid, String employeeName,LocalDate joinedDate, double salary, String dapartment) {
	setEmpid(empid);
	setEmployeeName(employeeName);
	setDapartment(dapartment);
	setSalary(salary);
	setJoinedDate(joinedDate);
	}
private LocalDate joinedDate;
private double salary;
private String dapartment;
private String employeeName;
private int empid;

int getEmpid() {
	return empid;
}
void setEmpid(int empid) {
	this.empid = empid;
}

String getEmployeeName() {
	return employeeName;
}
void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
LocalDate getJoinedDate() {
	return joinedDate;
}
void setJoinedDate(LocalDate joinedDate) {
	this.joinedDate = joinedDate;
}
double getSalary() {
	return salary;
}
void setSalary(double salary) {
	this.salary = salary;
}
String getDapartment() {
	return dapartment;
}
void setDapartment(String dapartment) {
	this.dapartment = dapartment;
}

}
