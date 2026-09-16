package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class PrimeNumInRange {

	static boolean isPrime(int n) {
		boolean flag = true;
 
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		} 
		return true;

		// Alternate code using If Else
//		if (n <= 1) {
//			flag = false;
//		} else {
//			for (int i = n; i <= n; i++) {
//				for (int j = 2; j < i; j++) {
//					if (i % j == 0) {
//						flag = false;
//						break;
//					}
//				}
//			}
//		}
// 
//		return flag;   

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n1: ");
		int n1 = sc.nextInt();

		System.out.println("Enter n2: ");
		int n2 = sc.nextInt();

		for (int i = n1; i < n2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
