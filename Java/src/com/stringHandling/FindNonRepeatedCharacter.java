package com.stringHandling;

import java.util.Scanner;

public class FindNonRepeatedCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.nextLine();

//		String res = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//
//			if (res.indexOf(c) == -1) {
//				res = res + c;
//				break;
//			}
//
//		}
//		System.out.print(res);
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
