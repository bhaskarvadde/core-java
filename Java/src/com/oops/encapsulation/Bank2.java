package com.oops.encapsulation;

public class Bank2 {

	public static void main(String[] args) {
		Bank1 b1 = new Bank1("Bhaskar", 10000);

		System.out.println("Initial Details");
		System.out.println(b1);

		System.out.println();

		b1.deposit();

		System.out.println();

		b1.withdraw();

		System.out.println();

		System.out.println("Final Details");
		System.out.println(b1);
		
		Bank1 b2 = new Bank1("Vishwa", 8800);

		System.out.println("Initial Details");
		System.out.println(b2); 

		System.out.println();

		b2.deposit();

		System.out.println();

		b2.withdraw();

		System.out.println();

		System.out.println("Final Details");
		System.out.println(b2); 
		
		Bank1 b3 = new Bank1("Praveen", 5640);

		System.out.println("Initial Details");
		System.out.println(b3);

	}

}
