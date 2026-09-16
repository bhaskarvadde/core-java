package com.lab;

//1.Employee Salary Using Method Overloading
//Problem Statement:
//Write a Java program to calculate employee salary using method overloading.
//Requirements:
//1.Create a class named Employee.
//2.Overload the method calculateSalary() as follows:
//calculateSalary(salary)
//calculateSalary(salary, bonus)
//calculateSalary(salary,  bonus, allowance)
//3.Display the total salary for each method call.

public class MethodOverloading1 {
	double calculateSalary(double salary) {
		return salary;
	}

	double calculateSalary(double salary, double bonus) {
		return salary + bonus;
	}

	double calculateSalary(double salary, double bonus, double allowance) {
		return salary + bonus + allowance;
	}

	void main(String[] args) {
		System.out.println("Salary : " + calculateSalary(50000.00));
		System.out.println("Salary + Bonus : " + calculateSalary(50000, 9000));
		System.out.println("Salary + Bonus + allowance : " + calculateSalary(50000, 5000, 3000));
	}

}
