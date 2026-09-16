package com.arrays;

import java.util.Scanner;

public class TargetElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();

		int[] arr = new int[n]; 

		System.out.println("enter elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter target: ");
		int target = sc.nextInt();

		for (int i = 0; i < n; i++) {

			if (arr[i] == target) {
				System.out.println("Element found at Index " + i);
				break;
			}

		}
	}

}
