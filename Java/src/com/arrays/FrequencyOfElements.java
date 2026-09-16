package com.arrays;

import java.util.Scanner;

public class FrequencyOfElements {

	static void findFreq(int[] arr) {
		char[] ch = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 'a';
				}

			}
			System.out.println(arr[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		findFreq(arr);
	}

}
