package com.stringHandling;

import java.util.Scanner;

public class ConsonantsVowelsDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string");
		String s = sc.nextLine().toLowerCase();

		int chCount = 0;
		int cCount = 0;
		int vCount = 0;
		int dCount = 0;
		int specialChCount = 0;
		int spCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'a' && c <= 'z') {
				chCount++;

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vCount++;
				} else {
					cCount++;
				}
			} else if (Character.isDigit(c)) {
				dCount++;
			} else if (Character.isSpaceChar(c)) {
				spCount++;
			} else {
				specialChCount++;
			}
		}

		System.out.println("Char Count is: " + chCount);
		System.out.println("Vowel Count is: " + vCount);
		System.out.println("Consonant Count is: " + cCount);
		System.out.println("Digit Count is: " + dCount);
		System.out.println("Space Count is: " + spCount);
		System.out.println("specialChCount Count is: " + specialChCount);
	}

}
