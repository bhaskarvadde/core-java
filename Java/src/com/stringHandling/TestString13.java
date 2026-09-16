package com.stringHandling;

public class TestString13 {

	public static void main(String[] args) {
		String str = "Bhaskar Vadde is a Java Developer";
		
//		replace()
		System.out.println(str.replace('a', 'A')); 
		
		System.out.println(str.replace("Java", "Spring"));  
		
		String str2 = "kphb pin code is 500072";
		
//		replaceFirst()
		System.out.println(str2.replaceFirst("\\D", "X"));
		
//		replaceAll()
		System.out.println(str2.replaceAll("\\d", "X")); 
		
//		remove all spaces
		System.out.println(str2.replaceAll(" ", ""));
		
		String str3 = "         Hello World           ";
//		trim()
		System.out.println(str3.trim());
		
		
	}

}
