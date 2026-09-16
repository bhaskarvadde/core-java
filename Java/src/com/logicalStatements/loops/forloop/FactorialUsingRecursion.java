package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class FactorialUsingRecursion {
 
	// Recursive method to find factorial
	static long factorial(int n) {

		// Base Case
		if (n == 0 || n == 1) {
			return 1;
		}

		// Recursive Case
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = sc.nextInt();

		long fact = factorial(n);

		System.out.println("Factorial = " + fact);
	}
}

//Dry Run for n = 5
//factorial(5)
//= 5 * factorial(4)
//
//= 5 * (4 * factorial(3))
//
//= 5 * (4 * (3 * factorial(2)))
//
//= 5 * (4 * (3 * (2 * factorial(1))))
//
//= 5 * (4 * (3 * (2 * 1)))
//
//= 5 * (4 * (3 * 2))
//
//= 5 * (4 * 6)
//
//= 5 * 24
//
//= 120

//Recursion Tree for 5!
//factorial(5)
//    |
//    5 * factorial(4)
//            |
//            4 * factorial(3)
//                    |
//                    3 * factorial(2)
//                            |
//                            2 * factorial(1)
//                                    |
//                                    1

//Then values return upward:
//
//1
//↓
//2 × 1 = 2
//↓
//3 × 2 = 6
//↓
//4 × 6 = 24
//↓
//5 × 24 = 120