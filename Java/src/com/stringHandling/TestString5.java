package com.stringHandling;

//8. boolean	contains(CharSequence s)	- Returns true if and only if this string contains the specified 
//sequence of char values.

public class TestString5 {

	public static void main(String[] args) {
		String[] names = {"Bhaskar","Abhinay","Sampath","Vishwa","Praveen"};
		
//		8. contains()
		for(String name: names) {
//			to ignore cases
//			name.toUpperCase().contains("H")
//			name.toLowerCase().contains("H")
			if(name.contains("h")) {
				System.out.println(name); 
			}
		}
		
		System.out.println("************************");
		
//		9. startsWith()
		for(String name: names) {
			if(name.startsWith("B")) {
				System.out.println(name); 
			}
		}
		
		System.out.println("************************");
		
//		10. endsWith()
		for(String name: names) {
			if(name.endsWith("a")) {
				System.out.println(name); 
			}
		}
		
		System.out.println("************************");
		
//		11. toUpperCase()
		System.out.println(names[0].toUpperCase()); 
		
		System.out.println("************************");
		
//		12. toLowerCase()
		System.out.println(names[4].toLowerCase()); 
	}

}
