package com.caseStudies;

import java.util.Scanner;

public class Student {
	
	static double getTotalMarks(double s1,double s2,double s3,double s4, double s5) {
		double totalMarks = s1+s2+s3+s4+s5;
		  
		return totalMarks;
	}
	
	static double getPercentage(double totalMarks) {
		double per = (totalMarks/500)*100;
		return per;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sub1 marks");
		double sub1 = sc.nextDouble();
		
		System.out.println("Enter sub2 marks");
		double sub2 = sc.nextDouble();
		
		System.out.println("Enter sub3 marks");
		double sub3 = sc.nextDouble();
		
		System.out.println("Enter sub4 marks");
		double sub4 = sc.nextDouble();
		
		System.out.println("Enter sub5 marks");
		double sub5 = sc.nextDouble();
		
		double total = getTotalMarks(sub1,sub2,sub3,sub4,sub5);
		System.out.println(total); 
		 
		double percentage = getPercentage(total); 
		System.out.println("The Percentage of the Student is: " + percentage);

	}

}
