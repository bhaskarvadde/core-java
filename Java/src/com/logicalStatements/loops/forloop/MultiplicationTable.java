package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class MultiplicationTable {

	static void multiplication(int n, int n1) {
		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();

		System.out.println("Enter upto where you want to print");
		int n1 = sc.nextInt();

		multiplication(n, n1);
	}

}
