package com.lab;

//Write a java program to demonostrate inheritence Create a parent class Person with fields name and 
//age, and a method displayDetails().
//->Create a child class Student that extends Person and adds a field rollNo.
//->Add a method displayStudentInfo() in Student.
//->Create a Student object and initialize all values.
//Display both person and student details using inherited and child class methods

class Person {
	String name;
	int age;

	void displayDetails() {

		System.out.println("Person Method called");
		System.out.println(name);
		System.out.println(age);
	}
}

public class Student extends Person {
	int rollNo;

	public Student(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	void displayStudentInfo() {
		System.out.println("Student Method called");
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		Student s = new Student("Bhaskar", 23, 10);

		s.displayDetails();
		s.displayStudentInfo();
	}

}
