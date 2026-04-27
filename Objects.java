package com.javaintroduction;

public class Objects {
	// static variables 
	// Declaration and Initialization
	static int id = 1;
	static String name = "Boss";
	
	static int age;
	static String course;
	
	String city = "Hyderabad";
	int mobile = 1234567890;

	public static void main(String[] args) {
		// accessing static data with initialization
		System.out.println("accessing static data from outside main method with initialization");
		System.out.println(name);// Boss
		System.out.println(id); // 1
		
		// without initialization
		System.out.println("accessing static data from outside main method without initialization");
		System.out.println(age);// 0 - for int Datatypes
		System.out.println(course); // Null - for String Datatypes
		
		// accessing instance(non-static) variables
		// for that we need to create obj
		System.out.println("accessing instance(non-static) data from outside main method by creating methods");
		Objects obj = new Objects();
		System.out.println(obj.city); // calling
		System.out.println(obj.mobile); // calling
	}
}



