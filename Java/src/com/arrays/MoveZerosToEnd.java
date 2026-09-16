package com.arrays;

//.Write a Java program to move all the zeroes in an integer array to the end of the array using only one loop.
//Input:Array = {0, 1, 0, 3, 12}
//Output:{1 ,3, 12, 0 ,0}

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		for (int e : arr) {
			System.out.print(e + " ");
		}

		int index = 0;
		for (int i = 0; i < arr.length; i++) { // O(n)

			if (arr[i] != 0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index++;
			}
		}

		System.out.println();

		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

}
