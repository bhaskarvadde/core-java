// Declaring variables in class level, create instance method and assign values in it and call that instance method in main method.

package com.lab;

public class VariableAccess {
	byte b;
	short s;
	int i;
	long l;
	
	void show() {
		b = 120;
		s = 5546;
		i = 456464646;
		l = 5454554544545454545L;
		
		System.out.println("byte = " + b);
		System.out.println("short = " + s);
		System.out.println("int = " + i);
		System.out.println("long = " + l);
	}
	
	public static void main(String[] args) {
		VariableAccess obj = new VariableAccess();
		obj.show();
	}

} 
