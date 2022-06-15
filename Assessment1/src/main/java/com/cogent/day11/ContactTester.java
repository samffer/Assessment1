package com.cogent.day11;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class ContactTester {
	
	
	
	public static String invert(String invert) {
		String y = invert.substring(6, 10);
		String m = invert.substring(0,2);
		String d = invert.substring(3,5);
			
	return y+"-"+m+"-"+d;
	}
	
	public static void main(String[] args) {
		ContactService book = new ContactService();
		//SimpleDateFormat format = new SimpleDateFormat();
		

		
		book.addContact("sam", 123456789, "Mimosa dr",Date.valueOf(invert("05-30-1985")));
		book.addContact("peter", 123456789, "WestView dr",Date.valueOf(invert("12-10-2000")));
		book.addContact("Josh", 123456789, "Rincon st",Date.valueOf(invert("01-31-1999")));
		book.addContact("Ana", 123456789, "Selma ave",Date.valueOf(invert("01-03-1995")));
		book.addContact("Miller", 123456789, "N 1st st",Date.valueOf(invert("05-30-1985")));
		book.addContact("Maria", 123456789, "Keppler dr",Date.valueOf(invert("12-10-2000")));
		book.addContact("Leo", 123456789, "Princess dr",Date.valueOf(invert("03-03-1995")));
		book.addContact("Eve", 123456789, "Avenida dr",Date.valueOf(invert("05-30-1985")));
		book.addContact("Robert", 123456789, "Montainview dr",Date.valueOf(invert("01-03-1995")));
		book.addContact("Tim", 123456789, "Palace rd",Date.valueOf(invert("01-31-1999")));
		book.addContact("Nick", 123456789, "Charmosa dr",Date.valueOf(invert("05-30-1985")));
		book.addContact("Art", 123456789, "5th ave",Date.valueOf(invert("12-10-2000")));

		book.searchContact("peter");

		book.printAllContact();
		
		
		
	}
	
	

}
