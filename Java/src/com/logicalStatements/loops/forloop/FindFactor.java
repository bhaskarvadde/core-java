package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n value");
		int n = sc.nextInt();
 
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
