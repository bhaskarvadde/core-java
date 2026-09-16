package com.dsa;

import java.util.Arrays;

//Reverse an Array with Swapping ?
// Array reversal
// Right to Left
public class ArrayRotation {

	static void rotateArray(int[] arr) {

		// Pointer to the first element
		int start = 0;

		// Pointer to the last element
		int end = arr.length - 1;

		// Swap elements from both ends until pointers meet
		while (start < end) {

			// Store the first element temporarily
			int temp = arr[start];

			// Move last element to the first position
			arr[start] = arr[end];

			// Move stored element to the last position
			arr[end] = temp;

			// Move start pointer forward
			start++;

			// Move end pointer backward
			end--;
		}

		/*
		 * Time Complexity: O(n) - The loop runs n/2 times. - Ignoring constants,
		 * complexity is O(n).
		 *
		 * Space Complexity: O(1) - Only a few extra variables (start, end, temp) are
		 * used. - No additional array is created.
		 *
		 * Pattern: Two Pointers
		 * 
		 * The loop swaps two elements at a time:
		 * 
		 * First with last Second with second-last Third with third-last ...
		 * 
		 * So you only need to go halfway through the array.
		 * 
		 */
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		// To print an Array
		System.out.println("Before Rotation");
		System.out.println(Arrays.toString(arr));

		rotateArray(arr);

		System.out.println("After Rotation");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
