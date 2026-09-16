package com.fundamentals.methods;

public class Methods {
	
	static void add(int a , int b,int c) {
		System.out.println("Addition: ");
		System.out.println(a+b+c); 
	}
	
	static void sub(int a , int b,int c) {
		System.out.println("Subtraction: ");
		System.out.println(a+b-c); 
	}
	
	static void mul(int a , int b,int c) {
		System.out.println("Multiplication: ");
		System.out.println(a*b*c); 
	}
	
	static void div(int a , int b) {
		System.out.println("Division: ");
		System.out.println(a/b); 
	} 
	
	static void mod(int a , int b) {
		System.out.println("Modulus: ");
		System.out.println(a%b); 
	}

	public static void main(String[] args) {
		System.out.println("Calculations");
		System.out.println("--------------------");
		add(10,40,20);
		sub(100,50,20);
		mul(10,20,30);
		div(100,2); 
		mod(10,2);
	}

}
