package com.stringHandling;

// 	1. charAt(int index) method
import java.util.Scanner;

public class ReverseAndPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");
		String str = sc.nextLine();

		String rstr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			rstr = c + rstr;
		}

		System.out.println("Reverse of a String : " + rstr);

		if (str.equalsIgnoreCase(rstr)) {
			System.out.println("The given String is Palindrome");
		} else {
			System.out.println("The given String is not Palindrome");
		}
	}

}
