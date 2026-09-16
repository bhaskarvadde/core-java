package com.oops.methodoverloading;

public class VarArgs {
	
//	void method1() {
//		System.out.println("No org method");
//	}
//	
//	void method2(int a) {
//		System.out.println(a);
//	}
//	
//	void method3(int a, int b) {
//		System.out.println(a+b);
//	}
	 
	void method(int... numbers) {
		int sum = 0;
		
		for(int n: numbers) {
			System.out.print(n + " "); 
			sum += n;
		}
		System.out.println();
		System.out.println(sum); 
	}

	void main(String[] args) {
		method();
		method(10); 
		method(10,20); 
		method(10,20,30);
	}

}
