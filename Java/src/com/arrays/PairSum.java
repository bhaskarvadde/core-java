package com.arrays;

//Given an integer array arr[] and an integer target, write a program to find and print all pairs of elements whose sum is equal to the given target.
//Intput:arr = {2, 4, 3, 5, 7, 8, 9}
//target = 7
//Output:Pairs:
//(2, 5)
//(4, 3)

public class PairSum {
	static void sumPair(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
//					System.out.println(arr[i] + ","+ arr[j]); // values
					System.out.println(i + "," + j); // indexes
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int target = 7;

		sumPair(arr, target);
	}

}
