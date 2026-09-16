package com.oops.inheritance.bankingApplication;

import java.util.Scanner;

public class Loan {
	
	Scanner sc = new Scanner(System.in);
	
	boolean validateAadhaar(String aadhaar) {
		return aadhaar.matches("\\d{12}");
	} 
 
	boolean validatePAN(String pan) {
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	boolean validatePhone(String phone) {
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	double getCustomerSalary() {
		System.out.println("Enter your salary: ");
		double salary = sc.nextInt();

		return salary;
	}
  
	int getCustomerAge() {
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		return age;
	}

	int getCibilScore() {
		System.out.println("Enter your cibil score: ");
		int cibil = sc.nextInt();

		return cibil;
	}

	double roiInfo() {
		double roi = 12.0;

		int cibilScore = getCibilScore();

		if (cibilScore >= 300 && cibilScore <= 599) {
			System.out.println(
					"Poor score; high risk for lenders, loan applications may be rejected or approved at high interest rates ");
			roi = 11.0;
		} else if (cibilScore >= 600 && cibilScore <= 699) {
			System.out.println("Fair score; moderate risk, may face stricter loan terms");
			roi = 10.0;
		} else if (cibilScore >= 700 && cibilScore <= 749) {
			System.out.println("Good score; better chances of loan approval with favorable interest rates");
			roi = 9.0;
		} else if (cibilScore >= 750 && cibilScore <= 900) {
			System.out.println(
					"Excellent score; lowest risk, easier loan approval, and potential for higher loan amounts at lower interest rates ");
			roi = 8.0;
		} else {
			System.out.println("Invalid Cibil info ");
		}

		return roi;

	}

	String getAddressInfo() {
		String address = "";

		System.out.println("Enter Flat number:");
		String flat = sc.next();

		System.out.println("Enter Plot name:");
		String plot = sc.next();

		System.out.println("Enter Street name:");
		String street = sc.next();

		System.out.println("Enter city name:");
		String city = sc.next();
 
		System.out.println("Enter State name:");
		String state = sc.next();

		System.out.println("Enter country name:");
		String country = sc.next();

		address = "Flat no: " + flat + " Plot Name " + plot + " Street Name: " + street + " city: " + city + " state: "
				+ state + " country: " + country;

		return address;
	}

	
}
