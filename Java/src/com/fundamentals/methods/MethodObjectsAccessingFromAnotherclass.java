package com.fundamentals.methods;

public class MethodObjectsAccessingFromAnotherclass {
	
	static void personDetails(Student s) {
		System.out.println(s.name); 
		System.out.println(s.age); 
		System.out.println(s.course); 
		
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		
		personDetails(s1); 
	}
 
}
