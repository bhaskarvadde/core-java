package com.lab;
import java.util.Scanner;

public class Operations {
	
	
	static int addition(int a, int b) {
		int sum = a+b;
		
		return sum; 
	}
	
	static int sub(int a, int b) {
		int diff = a-b;
		
		return diff; 
	}
	
	static int mul(int a, int b) {
		int product = a*b;
		 
		return product; 
	}
	
	static int div(int a, int b) {
		int quo = a/b;
		 
		return quo; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		
		int sum = addition(a,b);
		System.out.println(sum);  
		
		
		System.out.println("Enter number 1"); 
		int c = sc.nextInt();
		
		System.out.println("Enter number 2");
		int d = sc.nextInt();
		  
		int dif = sub(c,d);
		System.out.println(dif); 
		
		
		System.out.println("Enter number 1");
		int p = sc.nextInt();
		
		System.out.println("Enter number 2");
		int q = sc.nextInt();
		
		int product = mul(p,q);
		System.out.println(product);  
		
		
		System.out.println("Enter number 1");
		int x = sc.nextInt();
		
		System.out.println("Enter number 2");
		int y = sc.nextInt();
		  
		int div = div(x,y);
		System.out.println(div); 
		

	}

}
