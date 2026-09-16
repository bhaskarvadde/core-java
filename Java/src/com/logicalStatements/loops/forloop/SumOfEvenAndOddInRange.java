package com.logicalStatements.loops.forloop;
import java.util.Scanner;

public class SumOfEvenAndOddInRange {
	
	static void getSum(int start,int end) {
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sumOfEven += i;
			}else {
				sumOfOdd += i;
			}
		}
		
		System.out.println("Sum of Even = " + sumOfEven);
		System.out.println("Sum of Odd = " + sumOfOdd); 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting Range: ");
		int start = sc.nextInt();
		
		System.out.println("Enter End Range: ");
		int end = sc.nextInt();
		
		getSum(start,end);
	}

}
