package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class nArrayRotations {

	// Reverse elements between start and end indices
	static void rotate(int start, int end, int[] arr) {

		while (start < end) { // Runs approximately (end-start+1)/2 times

			// O(1)
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			// O(1)
			start++;
			end--;
		}

		// Time Complexity of this method = O(k)
		// where k = number of elements being reversed
		// Space Complexity = O(1)
	}

	// Rotate array to the right by r positions
	static void rotateArray(int[] arr, int r) {

		int start = 0;              // O(1)
		int end = arr.length - 1;   // O(1)

		r = r % arr.length;         // O(1)

		// Reverse entire array
		rotate(start, end, arr);    // O(n)

		// Reverse first r elements
		rotate(start, r - 1, arr);  // O(r)

		// Reverse remaining n-r elements
		rotate(r, end, arr);        // O(n-r)

		/*
		 * Total Time Complexity:
		 * O(n) + O(r) + O(n-r)
		 * = O(2n)
		 * = O(n)
		 *
		 * Space Complexity:
		 * Only a few variables are used (start, end, r, temp)
		 * = O(1)
		 */
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // O(1)

		System.out.println("Enter how many time you want to Rotation");

		int r = sc.nextInt(); // O(1)

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 }; // O(1) space already given

		rotateArray(arr, r); // O(n)

		System.out.println(Arrays.toString(arr)); // O(n) for printing
	}
}
