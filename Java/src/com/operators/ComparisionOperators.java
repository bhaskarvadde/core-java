package com.operators;

import java.util.Scanner;

public class ComparisionOperators {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("enter a value");
		double a = sc.nextDouble();
		
		System.out.println("enter b value");
		double b = sc.nextDouble();
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
	}

}
