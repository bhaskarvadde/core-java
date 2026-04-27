package com.javaintroduction;

public class Methods {
	
	static void drive() {
		System.out.println("Drive Method called");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called");
		
		Methods obj = new Methods();
		
		drive();
		obj.walk();
	}
	
	void walk() {
		System.out.println("Walk method called");
		
	}

}
