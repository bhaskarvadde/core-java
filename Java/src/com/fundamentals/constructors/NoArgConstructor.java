package com.fundamentals.constructors;

public class NoArgConstructor {
	String name;
	int age;
	 
	// No Arg Constructor
	NoArgConstructor(){
		System.out.println("No Arg Constructor Called");
		name = "Boss";
		age = 23;
		System.out.println(name);
		System.out.println(age); 
	}
	
	// Parameterized Constructor
	NoArgConstructor(String ename,int eage){
		name = ename; 
		age=eage; 
		System.out.println(name);
		System.out.println(age); 
	}
 
	public static void main(String[] args) {
		 
		NoArgConstructor obj = new NoArgConstructor(); 
		 
		NoArgConstructor obj2 = new NoArgConstructor();
	}

}
