package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

public class HcfLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        /*
         * HCF (Highest Common Factor) / GCD (Greatest Common Divisor)
         * -----------------------------------------------------------
         * Definition:
         * The largest number that divides both numbers exactly.
         *
         * Example:
         * 12 Factors = 1, 2, 3, 4, 6, 12
         * 18 Factors = 1, 2, 3, 6, 9, 18
         * Common Factors = 1, 2, 3, 6
         * HCF = 6
         */

        int hcf = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        /*
         * LCM (Least Common Multiple)
         * ---------------------------
         * Definition:
         * The smallest positive number that is exactly divisible by both numbers.
         *
         * Formula:
         * LCM = (a × b) / HCF
         *
         * Example:
         * a = 12, b = 18
         * HCF = 6
         * LCM = (12 × 18) / 6 = 36
         */

        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
	}

}
