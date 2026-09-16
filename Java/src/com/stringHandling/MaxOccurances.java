package com.stringHandling;

import java.util.Scanner;

public class MaxOccurances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc.next();
		
		int[] arr = new int[127];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		}
		
//		printing array
//		for (int i = 0; i < arr.length; i++) {
//		    if (arr[i] != 0) {
//		        System.out.println("arr[" + i + "] ('" + (char) i + "') = " + arr[i]);
//		    }
//		}
		
		int max = -1;
		char maxChar = ' ';
		
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)] > max) {
				max = arr[s.charAt(i)];
				maxChar = s.charAt(i);
			}
		}
		
		System.out.println("MaxChar : " + maxChar); 
	}

}
