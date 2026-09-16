package com.arrays;

public class RemoveDuplicates {
	static void removeDuplicates(int[] arr) {
		int[] res = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean found = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				}
			}

			if (!found) {
				res[k++] = arr[i];
			}
		}

		System.out.println("\nAfter Removing Duplicates");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 40, 30, 50, 60 };

		System.out.println("Original Array");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		removeDuplicates(arr);

	}

}
