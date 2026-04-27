package com.javaintroduction;

public class StaticAndInstanceMethodCalling {
	static void method1() {
		System.out.println("This is static method1");
		method2(); // calling static method inside static method
	}
	
	static void method2() {
		System.out.println("This is static method2");
		StaticAndInstanceMethodCalling obj = new StaticAndInstanceMethodCalling();
		obj.method3(); // calling instance method in static method
	}
	
	void method3() {
		System.out.println("This is instance method3");
		method4(); // calling instance method in instance method
	}
	
	void method4() {
		System.out.println("This is instance method4");
		method5(); // calling static method in instance method
	}
	
	static void method5() {
		System.out.println("This is static method 5");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
		
		System.out.println("Main method ended");
	}

}
