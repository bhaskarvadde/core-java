package com.arrays;

//Given an integer array arr[] and an integer target, write a program to find and print all pairs of elements whose sum is equal to the given target.
//Intput:arr = {2, 4, 3, 5, 7, 8, 9}
//target = 7
//Output:Pairs:
//(2, 5)
//(4, 3)

public class PairSumOptimized {
	static void sumPair(int[] arr, int target) {
		int first = 0;
		int last = arr.length - 1;

		while (first < last) {

			if (arr[first] + arr[last] == target) {
				System.out.println(first + ", " + last);

				first++;
				last--;
			} else if (arr[first] + arr[last] < target) {
				first++;
			} else {
				last--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int target = 7;

		sumPair(arr, target);
	}

}
