package com.fundamentals.constructors.thisOfPrgms;

public class Person {
	String name;
	int age;
	String course;

	// Default Constructor
	Person() {
		System.out.println("No-arg Constructor Called");

		this("Abhi", 25, "Python");

	}

	Person(String name, int age, String course) {
		System.out.println("3 arg Constructor");

		this("Boss", "Java");
		this.name = name;
		this.age = age;
		this.course = course;

	}

	Person(String name, String course) {
		System.out.println("2 arg Constructor");
		this(23);

	}

	Person(int age) {
		System.out.println("1 arg Constructor");
	}

	public static void main(String[] args) {
		Person obj = new Person();
		obj.display();

		Person obj2 = new Person("Bhaskar", 23, "Java");
		obj2.display();
	}

	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
		System.out.println("---------------------------");
	}

}
