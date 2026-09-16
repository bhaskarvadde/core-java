package com.arrays;

//It can be described as:
//
//Array Traversal Pattern
//Filtering / Compaction
//Using an Auxiliary Array (Extra Space)
//
//However, you could argue that it still uses two indices:
//
//i → reads from the original array
//count → writes into the result array
//
//But in interviews and DSA pattern discussions, this is usually not classified as a Two Pointers problem, because the pointers 
//are operating on different arrays and you're relying on extra space.

public class MoveZeroesToEnd {

	void moveZeroesToEnd(int[] arr) {
		int[] res = new int[arr.length];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				res[count] = arr[i];
				count += 1;
			}
		}

		// This loop is not required because Java initializes all elements
		// of a newly created int array to 0 by default. 
		for (int j = count; j < res.length; j++) {
			res[j] = 0;
		}

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
		// TC : O(n)
		// SC : O(n) 
	}

	void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		moveZeroesToEnd(arr);

	}

}
