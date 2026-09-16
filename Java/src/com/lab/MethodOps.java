package com.lab;

public class MethodOps {
	static void add() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum: " + sum);
	} 
	
	static void sub() {
		int a = 10;
		int b = 20;
		int diff = a-b;
		System.out.println("Diff: " + diff);
	} 
	
	static void mul() {
		int a = 10;
		int b = 20;
		int product = a*b;
		System.out.println("product: " + product);
	} 
	
	static void div() {
		int a = 10;
		int b = 20;
		int res = b/a;
		System.out.println("div: " + res);
	} 

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
	}

}
