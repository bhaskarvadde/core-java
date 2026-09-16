package com.operators;
import java.util.Scanner;

public class TernaryOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		double a = sc.nextDouble();
		
		System.out.println("Enter b value");
		double b = sc.nextDouble();
		
		System.out.println("Enter c value");
		double c = sc.nextDouble();
		
		double res = (a>b)?(a>c)?a:c:(b>c)?b:c;    
		
		System.out.println(res); 
	}

}
