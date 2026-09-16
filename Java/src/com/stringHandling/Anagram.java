package com.stringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String s1 = sc.next().toLowerCase();
		
		System.out.println("Enter second string");
		String s2 = sc.next().toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("the two strings are not Anagram");
		}else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1); 
			Arrays.sort(ch2); 
			
			System.out.println(ch1);
			System.out.println(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("The two strings are Anogram");
			}else {
				System.out.println("The two strings are not Anagram");
			}
		}
	}

}
