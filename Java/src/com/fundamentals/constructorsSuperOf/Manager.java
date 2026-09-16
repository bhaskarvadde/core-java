package com.fundamentals.constructorsSuperOf;

class Emp {
	String empName;
	int empId;
	double salary;

	Emp(String empName,int empId,double salary){
		this.empName=empName;
		this.empId=empId; 
		this.salary=salary;
	}
}

public class Manager extends Emp {
	String department;
	int teamSize;

	Manager(String empName,int empId,double salary,String department,int teamSize){ 
		super(empName,empId,salary);
		System.out.println("child no arg"); 
		this.department=department;
		this.teamSize=teamSize; 
	}

	public static void main(String[] args) {
		Manager s = new Manager("Deepika", 4, 50000.0, "Banking", 6);
		System.out.println(s.empName);
		System.out.println(s.empId);
		System.out.println(s.salary);
		System.out.println(s.department);
		System.out.println(s.teamSize);
	}

}
