package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

/*
 * Question:
 * Write a Java program to check whether a given number is a Strong Number.
 *
 * Strong Number:
 * A number is called a Strong Number if the sum of the factorials
 * of its digits is equal to the original number.
 *
 * Example:
 * 145
 * = 1! + 4! + 5!
 * = 1 + 24 + 120
 * = 145
 */

public class StrongNumber {

    // Finds the factorial of a digit
    static int findFact(int r) {

        int fact = 1;

        // Calculate r!
        for (int i = 1; i <= r; i++) {
            fact *= i;
        }

        return fact;
    }

    static boolean isStrongNumber(int n) {

        // Store the original number
        int original = n;

        // Stores the sum of factorials
        int sum = 0;

        // Process every digit
        while (n > 0) {

            // Extract the last digit
            int r = n % 10;

            // Add the factorial of the digit
            sum += findFact(r);

            // Remove the last digit
            n = n / 10;
        }

        // Compare the sum with the original number
        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        if (isStrongNumber(n)) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }

        sc.close();
    }
}