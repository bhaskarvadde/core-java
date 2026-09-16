package com.caseStudies;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}
}

public class Manager extends Employee {
	String department;

	Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	void display() {
		System.out.println("Manager Details: ");
		System.out.println(name);
		System.out.println(department);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Manager m = new Manager("Bhaskar", 50000.0, "IT Department");
		m.display();

	}

}
