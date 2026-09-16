package com.operators;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		String res = (n%2==0)?"Even":"Odd";
		
		System.out.println(res); 
	}

}

