package com.dsa.sortings;

//What is Selection Sort?
//
//Selection Sort is a sorting algorithm that repeatedly finds the smallest element from the unsorted part of the array and places it at the correct position.
//
//Unlike Bubble Sort, which swaps many times, Selection Sort performs at most one swap per pass.

//Algorithm:
//1.Assume the first element of the unsorted part is the minimum.
//2.Search the remaining elements for a smaller value.
//3.If found, update the minimum index.
//4.After scanning the unsorted part, swap the minimum element with the first unsorted element.
//5.Repeat until the array is sorted.

import java.util.Scanner;

public class SelectionSort {

	// Method to perform Selection Sort
	static void selectionSort(int[] arr) {

		// Outer loop selects the position where the minimum element
		// from the unsorted part should be placed
		for (int i = 0; i < arr.length - 1; i++) {

			// Assume the current element is the minimum
			int minIndex = i;

			// Find the actual minimum element in the remaining array
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the minimum element with the current position
			
			// skip swap if min element is not changes
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}

		}

		/*
		 * Time Complexity:
		 *
		 * Outer Loop: Runs (n - 1) times TC = O(n)
		 *
		 * Inner Loop: Pass 1 -> n - 1 comparisons Pass 2 -> n - 2 comparisons Pass 3 ->
		 * n - 3 comparisons ... Pass n-1 -> 1 comparison
		 *
		 * Total Comparisons: (n - 1) + (n - 2) + ... + 1 = n(n - 1) / 2
		 *
		 * Best Case : O(n²) Average Case : O(n²) Worst Case : O(n²)
		 *
		 * Space Complexity: O(1) Only a few extra variables (minIndex, temp) are used.
		 */
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Call Selection Sort
		selectionSort(arr);

		// Print Sorted Array
		System.out.println("Sorted Array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}