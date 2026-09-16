package com.fundamentals;

public class TypeCasting {
 
    public static void main(String[] args) {
    	byte b = 120;
		short s = 5546;
		int i = 456464646;
		long l = 5454554544545454545L; 
		
		System.out.println("Implicit Typecasting:");
		s = (short)b; // byte -> short
		System.out.println("byte to short: " + s);
        i = (int)s; // short -> int
        System.out.println("short to int = " + i);
        l = (long)i; // int -> long
        System.out.println("int to long = "+l);
        
        System.out.println("Explicit Typecasting:");
        long l1 = 5454554544545454545L; 
        float f = l1;
        System.out.println( "long to float = " + f);
        long l3 = 4554512121215455454L;
        double d = (double) l3;
        System.out.println("long to double = " + d);
    }
}