package com.logicalStatements.loops.forloop;

import java.util.Scanner;

/*
 * Question:
 * Write a Java program to check whether a given number
 * is a Perfect Number or not.
 *
 * Perfect Number:
 * A number is called a Perfect Number if the sum of its
 * proper factors (excluding the number itself) is equal
 * to the number.
 *
 * Example:
 * 6 -> Factors: 1, 2, 3
 * Sum = 1 + 2 + 3 = 6
 * Therefore, 6 is a Perfect Number.
 */

public class PerfectNumber2 {

	// Method to check whether a number is perfect
	static boolean isPerfect(int n) {

		// Assume number is not perfect
		boolean status = false;

		// Variable to store sum of proper factors
		int sum = 0;

		// Find factors from 1 to n/2
		// Any proper factor cannot be greater than n/2
		for (int i = 1; i <= n / 2; i++) {

			// Check if i is a factor of n
			if (n % i == 0) {

				// Add factor to sum
				sum += i;
			}
		}

		// If sum of proper factors equals number
		// then it is a perfect number
		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {

		// Create Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Read number from user
		System.out.println("Enter n: ");
		int n = sc.nextInt();

		// Call method and store result
		boolean flag = isPerfect(n);

		// Display result
		if (flag) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}
	}
}













