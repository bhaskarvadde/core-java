package com.dsa.sortings;

import java.util.Scanner;

public class BubbleSort2 {

	// Method to perform Optimized Bubble Sort
	static void bubbleSort(int[] arr) {
 
		// Outer loop for passes 
		for (int i = 0; i < arr.length - 1; i++) { // O(1)  

			// Flag to check whether any swap occurs in a pass
			boolean isSwapped = false;
 
			// Compare adjacent elements in the unsorted portion
			for (int j = 0; j < arr.length - 1 - i; j++) { // O(n)  
 
				// Swap if elements are in the wrong order
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
 
					isSwapped = true; 
				}
			}

			// If no swaps occurred, array is already sorted
			if (!isSwapped) {
				break;
			} 
		}

		// Time Complexity:
		// Best Case : O(n) (array already sorted)
		// Average Case : O(n²)
		// Worst Case : O(n²) 

		// Space Complexity:
		// O(1) - uses only a temporary variable for swapping
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Read size of array
		System.out.println("Enter size:");
		int n = sc.nextInt();

		// Create array
		int[] arr = new int[n];

		// Read array elements
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Call sorting method
		bubbleSort(arr);

		// Print sorted array
		System.out.println("Sorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
