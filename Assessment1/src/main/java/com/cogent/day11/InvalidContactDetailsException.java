package com.cogent.day11;

public class InvalidContactDetailsException extends Exception {

	public InvalidContactDetailsException(String message) {
		super(message);
		System.out.println(message);
	}

}
