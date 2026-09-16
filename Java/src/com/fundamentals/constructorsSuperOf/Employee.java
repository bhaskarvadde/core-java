package com.fundamentals.constructorsSuperOf;

public class Employee {
	String projectName;
	String techUsed;
	int timeInMonths;
	
	Employee(){
		System.out.println("Employee class Default Constructor");
	}
	
	Employee(String projectName,String techUsed,int timeInMonths){
		System.out.println("Employee class 3 arg Constructor");
	}
}

class Project extends Employee{
	
	Project(){
		super();
		System.out.println("Project Default Constructor");
	}
	
	Project(String projectName,String techUsed,int timeInMonths){
		System.out.println("Project 3 arg Constructor");
		this.projectName=projectName;
		this.techUsed=techUsed;
		this.timeInMonths=timeInMonths;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Project p = new Project();
		System.out.println(p.projectName); 
		System.out.println(p.techUsed);
		System.out.println(p.timeInMonths); 
		
		Project p1 = new Project("Cloud","Spring",6);
		System.out.println(p1.projectName);
		System.out.println(p1.techUsed);
		System.out.println(p1.timeInMonths); 
		
	}
}
