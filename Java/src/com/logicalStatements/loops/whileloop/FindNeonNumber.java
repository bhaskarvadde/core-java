package com.logicalStatements.loops.whileloop;
 
import java.util.Scanner;

/*
 * Question:
 * Write a Java program to check whether a given number is a Neon Number.
 *
 * Neon Number:
 * A number is called a Neon Number if the sum of the digits
 * of its square is equal to the original number.
 *
 * Examples:
 * 9² = 81
 * 8 + 1 = 9
 * Therefore, 9 is a Neon Number.
 *
 * 12² = 144
 * 1 + 4 + 4 = 9
 * 9 != 12
 * Therefore, 12 is not a Neon Number.
 */

public class FindNeonNumber {

	static boolean isNeon(int n) {

		// Find the square of the number
		int sq = n * n;

		boolean status = false;

		// Stores the sum of digits of the square
		int sum = 0;

		// Extract every digit from the square
		while (sq > 0) {

			// Get the last digit
			int r = sq % 10;

			// Add the digit to the sum
			sum += r;

			// Remove the last digit
			sq = sq / 10;
		}

		// If the sum equals the original number,
		// it is a Neon Number
		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		boolean status = isNeon(n);

		if (status) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Non Neon Number");
		}

		sc.close();
	}
}
