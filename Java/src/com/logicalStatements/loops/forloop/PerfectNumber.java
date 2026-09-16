package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class PerfectNumber {

	static void findPerfect(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}

		}
		System.out.println(n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();

		findPerfect(n);

	}

}
