package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class CheckPrime {

	static boolean isPrime(int n) {

		// Assume the number is prime initially
		boolean status = true;

		// Numbers less than or equal to 1 are not prime
		if (n <= 1) {
			status = false;
		}

		// Check for factors from 2 to n/2
		for (int i = 2; i <= n / 2; i++) {

			// If n is divisible by i, then n is not prime
			if (n % i == 0) {
				status = false;
				break; // No need to check further
			}
		}

//		Interview Perspective
//
//		If you say:
//
//		"I reduced the loop from n to n/2."
//
//		The interviewer will say:
//
//		"Good optimization, but the complexity is still O(n)."
//
//		If you say:
//
//		"I reduced it to √n."
//
//		Now the complexity changes:
//
//		O(n)  →  O(√n)
//
//		and that's a significant algorithmic improvement.

		// Return the result
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = sc.nextInt();

		if (isPrime(n)) {
			System.out.println("The given number is Prime");
		} else {
			System.out.println("The given number is Not Prime");
		}
	}

}
