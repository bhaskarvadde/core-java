package com.fundamentals.constructors.thisOfPrgms;

public class Mul {
	int a;
	int b;
	
	Mul(){
		System.out.println("Default constructor");
	}
	
	Mul(int a,int b){
		System.out.println(a);
		this(5);
		System.out.println(a*b); 
	}
	
	Mul(int b){
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		Mul obj = new Mul(20,50);
	}

}
