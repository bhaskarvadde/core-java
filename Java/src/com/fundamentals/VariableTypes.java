package com.fundamentals;

public class VariableTypes {
	static String name = "Bhaskar";
	static int rollNo = 10;
	
	String college = "VCube";
	
	static void method1() {
		int age = 23;
		System.out.println(age);
	}
 
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();
		
		System.out.println(name); 
		System.out.println(VariableTypes.rollNo);
		System.out.println(obj.name);
		
		System.out.println(obj.college);
		
		String mobile = "Xiaomi";
		  
		System.out.println(mobile);
		
		method1();
		
	}

}
