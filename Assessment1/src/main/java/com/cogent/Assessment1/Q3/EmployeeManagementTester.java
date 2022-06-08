package com.cogent.Assessment1.Q3;

public class EmployeeManagementTester {

	public static void main(String[] args) {
		EmployeeManagement emp1 = new EmployeeManagement();
		
		emp1.add("Peter McMiller", 4835, "1548 N Parkway");
		emp1.display();
		emp1.delete();
	}

}
