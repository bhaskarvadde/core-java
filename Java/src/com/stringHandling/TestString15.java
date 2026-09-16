package com.stringHandling;

public class TestString15 {

	public static void main(String[] args) {
		String str = "Spring";
		
		System.out.println(str.substring(3));
		
		// beginIndex the beginning index, inclusive
		// endIndex the ending index, exclusive
		System.out.println(str.substring(4, 6));
		
		System.out.println(str.subSequence(1,4));
	}

}
