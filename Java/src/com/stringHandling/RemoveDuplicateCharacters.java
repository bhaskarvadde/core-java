package com.stringHandling;

//1. Write a Java program to remove duplicate characters from a given string while preserving the 
//order of their first occurrence.
//Input: programming
//Output: progamin

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String str = "programming";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (res.indexOf(c) == -1) {

				res += c;
			}

		}

		System.out.println(res);
	}

}
