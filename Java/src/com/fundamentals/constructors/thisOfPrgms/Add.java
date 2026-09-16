package com.fundamentals.constructors.thisOfPrgms;

public class Add {
	int a;
	int b;
	
	Add(){
		System.out.println("Default constructor");
	}
	
	Add(int a,int b){
		System.out.println(a);
		this(5);
		System.out.println(a+b); 
	}
	
	Add(int b){
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		Add obj = new Add(20,50);
	}

}
