package com.logicalStatements.loops.forloop;

import java.util.Scanner;

//using Int 
// if we use int works upto 12! = 479001600 only 
// if we use long works upto 20! = 2432902008176640000
public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Read input number
		System.out.println("Enter n:");
		int n = sc.nextInt();

		// Initialize factorial with 1
		int fact = 1; // 12! = 479001600 only
//		long fact = 1; upto 20! = 2432902008176640000 

		// Multiply numbers from 1 to n
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		// Print factorial
		System.out.println("Factorial = " + fact);
	}
}
