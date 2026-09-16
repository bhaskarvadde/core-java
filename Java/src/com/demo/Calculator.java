package com.demo;

public class Calculator {
	static int addition(int a,int b){
		return a+b;
	};
	static int subtract(int a,int b){
		return a-b;
	};
	static double divsion(int a,int b){
		return a/b;
	};
	static int multiply(int a,int b){
		return a*b;
	};
	public static void main(String[] args) {
		int res1 = addition(10, 20);
		int res2 = subtract(10, 20);
		double res3 = divsion(10, 20);
		int res4 = multiply(10, 20);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}
