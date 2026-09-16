package com.logicalStatements.ifElsee.copy;

public class SmallestNum {

	public static void main(String[] args) {
		int a = 155;
		int b = 198;
		int c = 44;

		if (a < b && a < c) {
			System.out.println("a is lesser");
		} else if (b < a && b < c) {
			System.out.println("b is lesser");
		} else {
			System.out.println("c is lesser");
		}
	}

}
