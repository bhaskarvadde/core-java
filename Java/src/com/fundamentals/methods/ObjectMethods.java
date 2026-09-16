package com.fundamentals.methods;

class Student {

	String name = "Bhaskar Vadde";
	int age = 23;
	String course = "Java";

	void sayHello() {
		System.out.println("Hello");
	}
}

public class ObjectMethods {

	// Method returning object
	Student display() {
   
		// Creating object 
		Student s1 = new Student();

		// Returning object reference
		return s1;
	}

	public static void main(String[] args) {

		// Creating object to call non-static method
		ObjectMethods obj = new ObjectMethods();

		// Receiving returned object
		Student s1 = obj.display();

		// Accessing instance variables
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.course);

		// Accessing instance method
		s1.sayHello();
	}
}