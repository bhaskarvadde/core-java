package com.dsa.sortings;

//What is Bubble Sort?

//Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.
//
//After each pass, the largest element "bubbles up" to its correct position at the end of the array, hence the name Bubble Sort.

//Algorithm:
//Start with the first element of the array.
//Compare each pair of adjacent elements.
//If the left element is greater than the right element, swap them.
//Continue comparing and swapping until the end of the array.
//After the first pass, the largest element moves to its correct position at the end.
//Repeat the process for the remaining unsorted portion of the array.
//Continue until all passes are completed.
//(Optimized Version) If no swaps occur during a pass, stop the algorithm because the array is already sorted.
	
import java.util.Scanner;

public class BubbleSort1 {

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
//		System.out.println("Sorted Array:");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		sc.close();
	}

	// Method to perform Bubble Sort
	static void bubbleSort(int[] arr) {

		// Number of passes
		for (int i = 0; i < arr.length - 1; i++) { // O(n)

			// Compare adjacent elements
			for (int j = 0; j < arr.length - 1 - i; j++) { // O(n)

				// Swap if left element is greater
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Print sorted array
		System.out.println("Sorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// TC : O(n^2)
		// SC : O(1)
	}
}
