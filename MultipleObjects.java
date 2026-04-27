package com.javaintroduction;

public class MultipleObjects {
	static void Method1() {
		System.out.println("Method 1 called");
		method2();
	}
	
	static void method2() {
		System.out.println("Method 2 called");
		method3();
	}
	
	static void method3() {
		System.out.println("Method 3 called");
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!!");
		Method1();
		System.out.println("Main method ended");
	}

}
