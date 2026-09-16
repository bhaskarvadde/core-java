package com.stringHandling;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcabcbb";

		String longestStr = "";

		for (int i = 0; i < str.length(); i++) {
			String temp = "";

			for (int j = i; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (temp.indexOf(ch) != -1) {
					break;
				}
				temp += ch;
			}

			if (longestStr.length() < temp.length()) {
				longestStr = temp;
			}
		}

		System.out.println(longestStr);
	}

}
