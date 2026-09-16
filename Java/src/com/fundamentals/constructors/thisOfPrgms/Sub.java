package com.fundamentals.constructors.thisOfPrgms;

public class Sub {
	int a;
	int b;
	
	Sub(){
		System.out.println("Default constructor");
	}
	
	Sub(int a,int b){
		System.out.println(a);
		this(5);
		System.out.println(a-b); 
	}
	
	Sub(int b){
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		Sub obj = new Sub(20,50); 
	}

}
