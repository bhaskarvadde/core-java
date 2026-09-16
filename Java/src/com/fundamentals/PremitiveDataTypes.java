package com.fundamentals;

public class PremitiveDataTypes {
	byte b = -128 ; // size = -128 to 127 -- Default 0
	short s = 32767; // size = -32768 to 32767 -- Default 0
	int i = 2147483644; // size = -2147483648 to 2147483647 -- Default 0
	long l = 9223372036854775807L; // size = -9223372036854775808 to 9223372036854775807 -- Default 0
	
	float f; // -- Default 0.0
	double d; // -- Default 0.0
	
	char c; // -- Default " " (space)
	
	boolean bool; // Default false
	
	public static void main(String[] args) {
		PremitiveDataTypes obj = new PremitiveDataTypes();
		System.out.println("byte = " + obj.b);
		System.out.println("short = " + obj.s);
		System.out.println("int = " + obj.i);
		System.out.println("long = " + obj.l);
		   
		System.out.println("float = " + obj.f);
		System.out.println("double = " + obj.d);
		
		System.out.println("char = " + obj.c);
		
		System.out.println("bool = " + obj.bool);
	}

}
