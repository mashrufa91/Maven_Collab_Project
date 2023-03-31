package com.javacode_11thMar_2023;

public class LeapYearProgram {

	public static void main(String[] args) {

		
	// Simple Java Program to Determine if Year is a Leap Year 	
		int year = 2024; // enter year
	// determine if year meets conditions for leap year and print result
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  
			System.out.println(year + " is a leap year"); }
		else {
			System.out.println(year + " is not a leap year"); }
		
		// can also use Scanner class to take in value from user
		
		
	}

}
