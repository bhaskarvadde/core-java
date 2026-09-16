package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class EvenOddRecursion {
	
	static void evenOdd(int n) {
		n = Math.abs(n);  
		
		if(n==0) {
			System.out.println("Even");
			return;
		}
		
		if(n==1) {
			System.out.println("Odd");
			return;
		}
		
		evenOdd(n-2);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		evenOdd(n);
		
	}

}
