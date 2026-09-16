package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

/*
 * Question:
 * Write a Java program to check whether a given number is an Armstrong Number.
 *
 * Armstrong Number:
 * A number is called an Armstrong number if the sum of each digit raised
 * to the power of the total number of digits is equal to the original number.
 *
 * Examples:
 * 153 = 1³ + 5³ + 3³ = 153
 * 9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474
 *
 * Logic:
 * 1. Count the number of digits.
 * 2. Extract each digit.
 * 3. Raise the digit to the power of digit count.
 * 4. Add all the powers.
 * 5. Compare the sum with the original number.
 */

public class ArmstrongNumber {

    static boolean isArmstrong(int n) {

        boolean status = false;

        // Store the original number because 'n' changes
        int temp = n;
        int original = n;

        // ----------------------------
        // Step 1: Count the digits
        // ----------------------------
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        // ----------------------------
        // Step 2: Calculate the sum of powers
        // ----------------------------
        int sum = 0;

        while (temp > 0) {

            // Extract the last digit
            int rem = temp % 10;

            // Calculate rem^count
            int pow = 1;

            for (int i = 0; i < count; i++) {
                pow = pow * rem;
            }

            // Add the power to the sum
            sum += pow;

            // Remove the last digit
            temp = temp / 10;
        }

        // ----------------------------
        // Step 3: Compare
        // ----------------------------
        if (sum == original) {
            status = true;
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        boolean flag = isArmstrong(n);

        if (flag) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}