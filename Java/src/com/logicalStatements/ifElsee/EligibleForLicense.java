package com.logicalStatements.ifElsee;

public class EligibleForLicense {

	public static void main(String[] args) {
		int age = 17;

		if (age >= 18) {
			System.out.println("You are eligible for License");
		} else if (age < 18) {
			System.out.println("You are not eligible for License");
		} else {
			System.out.println("Invalid age");
		}
	}

}
