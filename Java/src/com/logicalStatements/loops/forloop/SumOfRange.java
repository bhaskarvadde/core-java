package com.logicalStatements.loops.forloop;
import java.util.Scanner;

public class SumOfRange {
	
	static int getSumOfNums(int n) {
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		return sum; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		int result = getSumOfNums(n);
		
		System.out.println(result);  
	}

}
