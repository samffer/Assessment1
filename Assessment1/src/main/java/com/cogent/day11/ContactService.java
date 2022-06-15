package com.cogent.day11;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ContactService {

	List<Contact> contacts = new ArrayList<>();
	
	void addContact(String name,int contactNumber,String addressLine,Date dateOfBirth) {
		Contact contact = new Contact(name, contactNumber, addressLine, dateOfBirth);
		contacts.add(contact);
		try {
			if(contact.isValid())
				System.out.println("You added "+name+" in your book!\n");
		}catch (InvalidContactDetailsException e) {
			System.err.println(e.getLocalizedMessage());			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	java.util.Date today=new java.util.Date();
	java.sql.Date date=new java.sql.Date(today.getTime()); //your SQL date object
	SimpleDateFormat simpDate = new SimpleDateFormat("MMMM-dd-yyyy");
	
	void searchContact(String n) {
		contacts.stream().filter(c -> c.name==n).forEach(c -> System.err.println("\nName: "+c.name+
				"\nContact Number: "+c.contactNumber+
				"\nAddress: "+c.addressLine+""
				+ "\nDate of birth: "+simpDate.format(c.dateOfBirth)
				+"\n-------------------------------------"));
	}
	
	void printAllContact() {
		contacts.forEach(c -> System.out.println("Name: "+c.name+
				"\nContact Number: "+c.contactNumber+
				"\nAddress: "+c.addressLine+""
				+ "\nDate of birth: "+simpDate.format(c.dateOfBirth)
				+"\n-------------------------------------"));
	}
	
}
