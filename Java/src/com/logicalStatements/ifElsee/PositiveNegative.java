package com.logicalStatements.ifElsee;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n:");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("Positive number");
		}else if(n<0){
			System.out.println("Negative Number");
		}else {
			System.out.println("Zero");  
		}
	}

}
