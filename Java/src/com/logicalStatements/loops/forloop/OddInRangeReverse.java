package com.logicalStatements.loops.forloop;

import java.util.Scanner;

public class OddInRangeReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--) {
			if(i%2!=0) {
				System.out.print(i + " "); 
			}
		}
	}

}
