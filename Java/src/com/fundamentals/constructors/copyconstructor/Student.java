package com.fundamentals.constructors.copyconstructor;

public class Student {
	String name;
	int id;
	String college;
	String city;
	double mobile;
	String branch; 
	
	Student(){
		System.out.println("No-arg constructor");
	}
	
	Student(String name,int id){
		this.name = name;
		this.id = id; 
	}
	
	Student(Student s,String college,String city){
		this.name = s.name;
		this.id = s.id;
		this.college = college;
		this.city = city;  
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Student s = new Student("Bhaskar",10); 
		s.show();
		
		Student s1 = new Student(s,"Bhaskar",10); 
		s1.show();
	}
	
	void show() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(college);
		System.out.println(city);
		System.out.println(mobile);
		System.out.println(branch);
		System.out.println("------------------------");
		
	}

}



































