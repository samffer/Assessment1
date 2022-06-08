package com.cogent.Assessment1.Q2;

public class SchoolRecords {
	
	String schoolName;
	int schoolID;
	String schoolAddress;
	
	void addRecords(String schoolName, String schoolAddress, int schoolID ) {
		this.schoolAddress=schoolAddress;
		this.schoolID=schoolID;
		this.schoolName=schoolName;
	}
	
	void dispRecords() {
		System.out.println("Scholl Name: " + schoolName);
		System.out.println("Scholl Adress: " + schoolAddress);
		System.out.println("Scholl IS: " + schoolID);
	}

}
