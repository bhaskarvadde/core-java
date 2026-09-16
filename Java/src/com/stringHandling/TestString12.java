package com.stringHandling;

public class TestString12 {

	public static void main(String[] args) {
		String str = "Java is simple in Vcube at kphb";

		// Split()
		String[] words = str.split("\\s");

		int count = 0;
		for (String word : words) {
			count++;
			System.out.println(word);
		}

		System.out.println("Count is: " + count);
		
		System.out.println();

		String str1 = "Java-is-simple-in-Vcube-at-kphb";

		// Split()
		String[] wordss = str1.split("-",4);

		int countt = 0;
		for (String word : wordss) {
			count++;
			System.out.println(word);
		}

		System.out.println("Count is: " + count);
	}

}
