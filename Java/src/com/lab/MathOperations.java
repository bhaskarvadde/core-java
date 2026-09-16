package com.lab;

import java.util.Scanner;

public class MathOperations {
	static double area(double radius) {
		double area = (3.14) * (radius * radius);
		
		return area;
	}
	
	static double volume(double radius) {
		double vol = (4/3) * (3.14 * (radius * radius*radius));
		
		return vol;
	}
	
	static double perimeterOfCircle(double radius) {
		double poc = 2 * (3.14 * radius);
		 
		return poc; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//area
		System.out.println("Enter Radius");
		
		double radius = sc.nextDouble();
		 
		double area = area(radius);
		System.out.println("The Area = "+area);
		
		//volume
		double vol = volume(radius);
		System.out.println("The Volume = " + vol);
		
		 
		//perimeter of circle
		double perimeter = perimeterOfCircle(radius);
		System.out.println("The Perimeter = " + perimeter);
	}

}
