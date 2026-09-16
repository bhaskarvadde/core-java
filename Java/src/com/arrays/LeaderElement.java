package com.arrays;

/*
 * Problem Statement:
 * ------------------
 * Given an integer array, print all the Leader Elements.
 *
 * A Leader Element is an element that is greater than all the elements
 * to its right side.
 *
 * The rightmost element is always considered a leader because there are
 * no elements to its right.
 *
 * Example:
 * --------
 * Input  : {12, 1, 7, 5, 6, 2}
 * Output :
 * 2
 * 6
 * 7
 * 12
 *
 * (Leaders are printed from right to left.)
 *
 * Algorithm:
 * ----------
 * 1. Assume the last element is the first leader.
 * 2. Traverse the array from right to left.
 * 3. If the current element is greater than the current leader,
 *    update the leader and print it.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class LeaderElement {

	public static void main(String[] args) {

		// Input array
		int[] arr = { 12, 1, 7, 5, 6, 2 };

		// The last element is always a leader
		int leaderEl = arr[arr.length - 1];

		// Print the first leader
		System.out.println(leaderEl);

		// Traverse the array from right to left
		for (int i = arr.length - 1; i >= 0; i--) {

			// If current element is greater than the current leader,
			// it becomes the new leader
			if (arr[i] > leaderEl) {

				// Update the leader
				leaderEl = arr[i];

				// Print the new leader
				System.out.println(leaderEl);
			}
		}
	}
}
