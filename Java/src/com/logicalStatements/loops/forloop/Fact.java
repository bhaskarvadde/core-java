package com.logicalStatements.loops.forloop;

import java.math.BigInteger;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {

		// Create Scanner object to read input from user
		Scanner sc = new Scanner(System.in);

		// Ask user to enter a number
		System.out.println("Enter n");
		int n = sc.nextInt();

		// Initialize factorial value with 1
		// BigInteger is used because factorial values grow very large
		// and cannot be stored in int or long for bigger numbers
		BigInteger fact = new BigInteger("1");

		// Multiply numbers from 1 to n
		for (int i = 1; i <= n; i++) {

			// fact = fact * i
			// BigInteger objects are immutable, so multiply()
			// returns a new BigInteger which must be assigned back
			fact = fact.multiply(BigInteger.valueOf(i));
		}

		// Print the factorial
		System.out.println(fact);
	}
}
