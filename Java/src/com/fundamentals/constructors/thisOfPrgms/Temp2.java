package com.fundamentals.constructors.thisOfPrgms;

public class Temp2 {
	Temp2(){
		System.out.println("Default Constructor");
		this(88);
	}
	
	Temp2(int x){
		System.out.println(x);
		this(77,88);
	}
	
	Temp2(int x,int y){
		System.out.println(y+x); 
	}

	public static void main(String[] args) {	
		new Temp2();
	}

}
