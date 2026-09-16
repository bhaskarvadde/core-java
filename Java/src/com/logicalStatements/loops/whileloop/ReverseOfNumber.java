package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

/*
 * Question:
 * Write a Java program to reverse the digits of a given number.
 *
 * Example:
 * Input : 1234
 * Output: 4321
 *
 * Logic:
 * 1. Extract the last digit using n % 10.
 * 2. Remove the last digit using n / 10.
 * 3. Append the extracted digit to the reverse number.
 * 4. Repeat until the number becomes 0.
 */

public class ReverseOfNumber {

    // Method to reverse a number
    static int getRevNumbers(int n) {

        int rev = 0; // Stores the reversed number
        int r = 0;   // Stores the last digit

        // Example: n = 1234
        while (n > 0) { // Continue until all digits are processed

            // Get the last digit
            r = n % 10;      // 4 -> 3 -> 2 -> 1

            // Remove the last digit
            n = n / 10;      // 123 -> 12 -> 1 -> 0

            // Shift previous digits left by one place (×10)
            // and append the current digit
            rev = rev * 10 + r; // 4 -> 43 -> 432 -> 4321
        }

        // Return the reversed number
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Call the method
        int rev = getRevNumbers(n);

        // Print the reversed number
        System.out.println("Reverse of Number: " + rev);

        sc.close();
    }
}