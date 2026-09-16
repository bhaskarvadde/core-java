package com.arrays;

import java.util.Scanner;

public class AddTwoArrays {

	static void addTwoArrays(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];

		if (arr1.length == arr2.length) { // O(1)
			for (int i = 0; i < arr1.length; i++) { // O(n)
				arr3[i] = arr1[i] + arr2[i];
				System.out.println(arr3[i]);
			}

		} // O(1)+O(n)=O(n)

//		for(int i=0;i<arr3.length;i++) {
//			System.out.print(arr3[i] + " "); 
//		} 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of arr 1: ");
		int n1 = sc.nextInt();

		int[] arr1 = new int[n1];
		System.out.println("enter arr1 elements: ");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter size of arr 2: ");
		int n2 = sc.nextInt();

		int[] arr2 = new int[n2];
		System.out.println("enter arr2 elements: ");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		addTwoArrays(arr1, arr2);

		sc.close();

	}

}
