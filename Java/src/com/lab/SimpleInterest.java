package com.lab;
import java.util.Scanner;

public class SimpleInterest {
	
	double calculateSI(double p, double t, double r) {
		double si = (p*t*r)/100;
		  
		return si;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleInterest obj = new SimpleInterest();
		
		System.out.println("Enter Principle: ");
		double principle = sc.nextDouble();
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		
		double result = obj.calculateSI(principle,time,rate);
		 
		System.out.println("Simple Interest = " + result);
	}

}
