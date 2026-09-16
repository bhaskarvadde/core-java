package com.logicalStatements.ifElsee;

public class Divisibility {

	public static void main(String[] args) {
		int n = 100;

		if (n % 5 == 0 && n % 11 == 0) {
			System.out.println("Divisible by 5 and 11");
		} else {
			System.out.println("Not divisible");
		}
	}

}
