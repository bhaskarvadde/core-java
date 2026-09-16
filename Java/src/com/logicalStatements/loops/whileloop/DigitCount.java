package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

/*
 * Question:
 * Write a Java program to count the number of digits in a given integer.
 *
 * Example:
 * Input : 12345
 * Output: 5
 *
 * Logic:
 * 1. Take a number as input.
 * 2. Repeat until the number becomes 0:
 *      - Remove the last digit using n = n / 10.
 *      - Increase the count.
 * 3. Return the count.
 */

public class DigitCount {

    // Method to count the number of digits
    static int getDigitCount(int n) {

        int count = 0; // Stores the number of digits
        
        if(n==0) {
        		return 1;
        }

        // Repeat until all digits are removed
        while (n > 0) {

            // Remove the last digit
            // (No need to store it since we're only counting digits)
            n = n / 10;

            // Increase digit count
            count++;
        }

        // Return total number of digits
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Call method
        int res = getDigitCount(n);

        // Display result
        System.out.println("Count is " + res);

        sc.close();
    }
}
