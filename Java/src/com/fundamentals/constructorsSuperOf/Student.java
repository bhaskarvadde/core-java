package com.fundamentals.constructorsSuperOf;

class College {
	String collegeName;
	char block;

	College(String collegeName, char block) {
		this.collegeName = collegeName;
		this.block = block;

		System.out.println("Parent No arg constructor");
	}

	public static void main(String[] args) {

	}

}

public class Student extends College {
	String studentName; 
	int rollNo;

	Student(String collegeName, char block, String studentName, int rollNo) {
		super(collegeName, block);
		this.studentName=studentName;
		this.rollNo=rollNo;
		System.out.println("child No arg constructor");
	}

	public static void main(String[] args) {
		Student s = new Student("Arjun College", 'B',"Bhaskar",37);
		System.out.println(s.collegeName);
		System.out.println(s.block);
		System.out.println(s.studentName); 
		System.out.println(s.rollNo);

	}
}




























