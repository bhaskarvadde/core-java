package com.lab;

class Company{
	String companyName;
	String companyLocation;
	
	Company(String companyName,String companyLocation){
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}
	
}

public class Employee extends Company{
	int empId;
	String empName;
	
	Employee(String companyName,String companyLocation,int empId, String empName){
		super(companyName,companyLocation);
		this.empId = empId;
		this.empName = empName;
	}
	
	

	public static void main(String[] args) {
		Employee e1 = new Employee("Microsoft","Hyderabad",1,"Bhaskar Vadde");
		e1.display();
		
		Employee e2 = new Employee("Google","Hyderabad",2,"Shravani");
		e2.display();
	}
	
	void display() {
		System.out.println(companyName);
		System.out.println(companyLocation);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println("------------------------");
	}

}
