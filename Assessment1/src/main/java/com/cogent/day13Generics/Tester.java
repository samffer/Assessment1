package com.cogent.day13Generics;

import java.time.LocalDate;

public class Tester {
	
	public static void main(String[] args) {
		
		EmployeeService empServ = new EmployeeService();
		empServ.readEmployeesData("employeeDetails.txt");
		//empServ.display();
		//empServ.searchEmployee(new Employee(106, "Peter", LocalDate.parse("2014-08-15"),6500, "IT"));
		//empServ.searchEmployeeByName("Peter");
		empServ.displaySorted();
		

	}

}
