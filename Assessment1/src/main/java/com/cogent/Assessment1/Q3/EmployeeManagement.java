package com.cogent.Assessment1.Q3;

public class EmployeeManagement {
	
	static String companyName = "Desvlopment Cia";
	private String empName;
	private String empAddress;
	private int empID;
	
	String getEmpName() {
		return empName;
	}
	void setEmpName(String empName) {
		this.empName = empName;
	}
	String getEmpAddress() {
		return empAddress;
	}
	void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	int getEmpID() {
		return empID;
	}
	void setEmpID(int empID) {
		this.empID = empID;
	}
	
	void add(String name, int id, String address) {
		setEmpName(name);
		setEmpID(id);
		setEmpAddress(address);
		System.out.println("Informations recorded\n=====================");
	}
	void display() {
		System.out.println("Company: "+companyName);
		System.out.println("Employee name: " + getEmpName());
		System.out.println("Employee ID"+getEmpID());
		System.out.println("Employee Address: "+getEmpAddress());
	}
	void delete() {
		setEmpAddress(null);
		setEmpID(0);
		setEmpName(null);
		System.out.println("\nInformations Erased\n=====================");
	}

}
