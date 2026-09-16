package com.arrays;

//1.Write a Java program to merge two sorted arrays into a single sorted array.
//Input:Array1 = {1, 3, 5, 7}
//Array2 = {2, 4, 6, 8}
//Output:Merged Array = {1, 2, 3, 4, 5, 6, 7, 8}

public class MergeTwoSortedArrays {
	static void mergeTwoarrays(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];

		for (int i = 0; i < res.length; i++) {
			int index = 0;
			for (int j = 0; j < arr1.length; j++) {
				res[index++] = arr1[j];
			}
			for (int k = 0; k < arr2.length; k++) {
				res[index++] = arr2[k];
			}
		}

		System.out.println("After Merging");
		for (int e : res) {
			System.out.print(e + " ");
		}

		for (int i = 0; i < res.length - 1; i++) { // O(1)

			boolean isSwapped = false;

			for (int j = 0; j < res.length - 1 - i; j++) { // O(n)

				if (res[j] > res[j + 1]) {

					int temp = res[j];
					res[j] = res[j + 1];
					res[j + 1] = temp;

					isSwapped = true;
				}
			}

			if (!isSwapped) {
				break;
			}
		}

		System.out.println("\nSorted Array");
		for (int e : res) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };

		mergeTwoarrays(arr1, arr2);

	}

}
