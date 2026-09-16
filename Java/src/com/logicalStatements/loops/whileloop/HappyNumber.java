package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

/*
 * Question:
 * Write a Java program to check whether a given number is a Happy Number.
 *
 * Happy Number:
 * A number is called a Happy Number if repeatedly replacing the number
 * by the sum of the squares of its digits eventually becomes 1.
 *
 * If the process enters a cycle (which always reaches 4),
 * then it is not a Happy Number.
 *
 * Example:
 * 19
 * 1² + 9² = 82
 * 8² + 2² = 68
 * 6² + 8² = 100
 * 1² + 0² + 0² = 1
 * Therefore, 19 is a Happy Number.
 */

public class HappyNumber {

    static boolean isHappyNum(int n) {

        boolean isHappyNum = false;

        // temp is used because its value changes
        int temp = n;

        // Continue until we get either 1 (Happy)
        // or 4 (Not Happy)
        while (temp != 1 && temp != 4) {

            // Stores the sum of squares of digits
            int sum = 0;

            // Process every digit
            while (temp > 0) {

                // Extract the last digit
                int r = temp % 10;

                // Square the digit
                int sq = r * r;

                // Add the square to the sum
                sum += sq;

                // Remove the last digit
                temp = temp / 10;
            }

            // Continue the process with the new sum
            temp = sum;
        }

        // If we reached 1, it is Happy
        if (temp == 1) {
            isHappyNum = true;
        }

        return isHappyNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        boolean flag = isHappyNum(n);

        if (flag) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }

        sc.close();
    }
}