package com.fundamentals.methods;

import java.util.Scanner;

public class MethodsWithReturnTypesNoArgs {

	static Scanner sc = new Scanner(System.in);

	// byte
	static byte sub() {

		System.out.println("Enter first byte number:");
		byte a = sc.nextByte();

		System.out.println("Enter second byte number:");
		byte b = sc.nextByte();

		byte diff = (byte) (a - b); // automatically a-b converts to int
//        byte diff = 100-50; this works because compiler calculates it at compile time.

		return diff; 
	}

	// short
	static short mul() {

		System.out.println("Enter first short number:");
		short a = sc.nextShort();

		System.out.println("Enter second short number:");
		short b = sc.nextShort();

		short product = (short) (a * b); // automatically a*b converts to int
//      byte diff = 100-50; this works because compiler calculates it at compile time.

		return product;
	}

	// int
	static int addition() {

		System.out.println("Enter first int number:");
		int a = sc.nextInt();

		System.out.println("Enter second int number:");
		int b = sc.nextInt();

		int sum = a + b;

		return sum;
	}

	// long
	static long div() {

		System.out.println("Enter first long number:");
		long a = sc.nextLong();

		System.out.println("Enter second long number:");
		long b = sc.nextLong();

		long division = (a / b);

		return division;
	}

	// float
	static float mod() {

		System.out.println("Enter first float number:");
		float a = sc.nextFloat();

		System.out.println("Enter second float number:");
		float b = sc.nextFloat();

		float mod = a % b;

		return mod;
	}

	// double
	static double salary() {

		System.out.println("Enter salary:");
		double sal = sc.nextDouble();

		System.out.println("Enter bonus:");
		double bonus = sc.nextDouble();

		double totalSalary = sal + bonus;

		return totalSalary;
	}

	// char
	static char gender() {

		sc.nextLine(); // clears leftover newline

		System.out.println("Enter gender:");
		char gender = sc.nextLine().charAt(0); // automatically gender converts to int
// that is why when we print two chars it converts to int and makes operations
//        char a = 'A';64
//        char b = 'B';65
//
//        System.out.println(a + b); //131

		return gender;
	}

	// String
	static String fullName() {

		System.out.println("Enter full name:");
		String fullName = sc.nextLine();

		return fullName;
	}

	public static void main(String[] args) {

		byte diff = sub();
		System.out.println("Difference: " + diff);

		short product = mul();
		System.out.println("Product: " + product);

		int sum = addition();
		System.out.println("Sum: " + sum); 

		long divisionResult = div();
		System.out.println("Division: " + divisionResult);

		float modResult = mod();
		System.out.println("Modulus: " + modResult);

		double totalSalary = salary();
		System.out.println("Total Salary: " + totalSalary);

		char userGender = gender();
		System.out.println("Gender: " + userGender);

		String name = fullName();
		System.out.println("Full Name: " + name);

		sc.close();
	}
}