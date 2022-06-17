package com.cogent.day13Generics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class EmployeeService {
	List<Employee> employeeList = new ArrayList<>();
	

	void readEmployeesData(String fileName) {
		try {
			File file = new File(fileName);

			BufferedReader bfread = new BufferedReader(new FileReader(file));

			String data = null;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

			while ((data = bfread.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(data, ",");
				employeeList.add(new Employee(Integer.parseInt(token.nextToken()), token.nextToken(),
						LocalDate.parse(token.nextToken(), formatter), Double.parseDouble(token.nextToken()),
						token.nextToken()));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public boolean searchEmployee(Employee emp) {
		if(employeeList.contains(emp)) {
			System.err.println("Employee Found");
			System.out.println("Name: " + emp.getEmployeeName() + " Employee ID: " + emp.getEmpid()
			+ "\n Department: " + emp.getDapartment() + "Salary: " + emp.getSalary()
			+ "\n Date of hired: " + emp.getJoinedDate() 
			+ "\n--------------------------------------\n");
			return true;
		}else {
			System.err.println("Employee "+emp.getEmployeeName()+" is not on file.");
			return false;
		}
	 }
	
	public void searchEmployeeByName(String name) {
		employeeList.forEach(e->{
			if(name.equals(e.getEmployeeName())){
				System.err.println("Employee Found");
				System.out.println("Name: " + e.getEmployeeName() + " Employee ID: " + e.getEmpid()
				+ "\n Department: " + e.getDapartment() + "Salary: " + e.getSalary()
				+ "\n Date of hired: " + e.getJoinedDate() 
				+ "\n--------------------------------------\n");
			}
		});
	}

	public void display() {
		for (Employee employee : employeeList) {
			System.out.println("Name: " + employee.getEmployeeName() + " Employee ID: " + employee.getEmpid()
					+ "\n Department: " + employee.getDapartment() + "Salary: " + employee.getSalary()
					+ "\n Date of hired: " + employee.getJoinedDate() 
					+ "\n--------------------------------------\n");
		}
	}
	

	
	void displaySorted() {
		sortEmployeesByJoinedDate(employeeList).forEach(e ->{
			System.out.println("Name: " + e.getEmployeeName() + " Employee ID: " + e.getEmpid()
			+ "\n Department: " + e.getDapartment() + "Salary: " + e.getSalary()
			+ "\n Date of hired: " + e.getJoinedDate() 
			+ "\n--------------------------------------\n");
		});
	}
	
	public List<Employee> sortEmployeesByJoinedDate(List<Employee> employees){
		employees.sort(new SortByBirthdate());
			
		return employees;
	}
	
}

class SortByBirthdate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getJoinedDate().compareTo(o2.getJoinedDate());
		}
}
