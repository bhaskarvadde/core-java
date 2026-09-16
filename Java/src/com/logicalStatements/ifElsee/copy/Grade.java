package com.logicalStatements.ifElsee.copy;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks:");
		double marks = sc.nextDouble();

		if (marks > 100 || marks < 0) {
			System.out.println("Invalid marks");
		} else if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 75) {
			System.out.println("Grade B");
		} else if (marks >= 60) {
			System.out.println("Grade C");
		} else if (marks >= 45) {
			System.out.println("Grade D");
		} else {
			System.out.println("Failed");
		}

	}

}
