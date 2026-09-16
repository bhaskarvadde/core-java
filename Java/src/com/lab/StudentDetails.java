package com.lab;

import java.util.Scanner;

public class StudentDetails {

	static void getTotal(int m1, int m2, int m3) {
		int totalMarks = m1 + m2 + m3;
		System.out.println("Total Marks = " + totalMarks);
	}

	static void getAverage(int m1, int m2, int m3) {
		int averageMarks = (m1 + m2 + m3) / 3;
		System.out.println("Average Marks = " + averageMarks);
	}
 
	static void display() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter subject 1 marks:");
		int sub1 = sc.nextInt();

		System.out.println("Enter subject 1 marks:");
		int sub2 = sc.nextInt();

		System.out.println("Enter subject 1 marks:");
		int sub3 = sc.nextInt();
  
		System.out.println("Student Marks Details");
		getTotal(sub1, sub2, sub3);
		getAverage(sub1, sub2, sub3);
	}

	public static void main(String[] args) {
		display();
	}

}
