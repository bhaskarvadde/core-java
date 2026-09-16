package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

public class FreqOfNumInDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = sc.nextInt();

		System.out.println("Enter digit to find count: ");
		int d = sc.nextInt();

		int freq = findFreqOfNum(n, d);

		System.out.println("Frequency of Digit is: " + freq);
	}

	static int findFreqOfNum(int n, int d) {
		int count = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;

			if (r == d) {
				count++;
			}
			n = n / 10; 
		}

		return count;
	}

}
