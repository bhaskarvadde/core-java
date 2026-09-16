package com.logicalStatements.loops.whileloop;

/*
 * Question:
 * Write a Java program to check whether a given number is a Palindrome.
 *
 * A palindrome number reads the same from left to right and right to left.
 *
 * Example:
 * Input : 121
 * Output: true
 *
 * Input : 123
 * Output: false
 *
 * Logic:
 * 1. Store the original number.
 * 2. Reverse the number.
 * 3. Compare the original number with the reversed number.
 * 4. If both are equal, it is a palindrome.
 */

import java.util.Scanner;

public class Palindrome {
	static boolean isPalindrome(int n) {

	    // Store the original number because 'n' changes during reversal
	    int original = n;

	    // Stores the reversed number
	    int rev = 0;

	    // Reverse the number
	    while (n > 0) {

	        // Extract the last digit
	        int r = n % 10;

	        // Append the digit to the reversed number
	        rev = rev * 10 + r;

	        // Remove the last digit
	        n = n / 10;
	    }

	    // If original and reversed numbers are equal,
	    // then the number is a palindrome
	    return original == rev;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}