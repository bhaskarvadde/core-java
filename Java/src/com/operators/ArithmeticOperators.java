package com.operators;

//Arithmetic Operators : + - * / %
public class ArithmeticOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int a1 = 98;
		int b1 = 4;
		
		System.out.println("Addition --> sum ***********");
		System.out.println(a + b);// sum ==> 30
		System.out.println("sum : " + a + b);// sum : 1020 ==> String + anything is String
		System.out.println("sum : " + (a + b));// BODMAS ==> sum : 30

		System.out.println("subtraction --> diff  ***********");
		System.out.println(b - a);// diff ==> 10
//		System.out.println("Diff : " + b -a);//CE//The operator - is undefined for the argument type(s) String, int
		System.out.println("Diff : " + (b - a));// 10

		System.out.println("Multiplication --> product ***********");
		System.out.println(a * b);// 200
		System.out.println("Product  : " + a * b);// Product : 200

		System.out.println("Division --> quotient   ***********");
		System.out.println(a1 / b1);//

		System.out.println("Modulus --> reminder ********");
		System.out.println(a1 % b1);//2
	}

}
