package com.cogent.day11;

import java.sql.Date;

public class Contact {
	
	public Contact() {}
	public Contact(String name, int contactNumber, String addressLine, Date dateOfBirth) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.addressLine = addressLine;
		this.dateOfBirth = dateOfBirth;
		
	}
	String name;
	int contactNumber; 
	String addressLine; 
	Date dateOfBirth;
	
	boolean isValid() throws InvalidContactDetailsException{
		if(name.isEmpty()||name==null||contactNumber==0||addressLine.isEmpty()||addressLine==null||dateOfBirth==null) {
			throw new InvalidContactDetailsException("is Required all fields must be completed");
		}else return true;

	}
}
