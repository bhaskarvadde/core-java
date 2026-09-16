package com.arrays;

//1.Write a Java program to find all the missing numbers from an array containing numbers from 1 to N.
//Input:N = 12
//Array = {1, 3, 4, 6, 8, 9, 12}
//Output:Missing Numbers = 2 5 7 10 11

public class FindMissingNumbers {

	static void getMissingEl(int[] arr) {
		int n = 12;
		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 8, 9, 12 };

		getMissingEl(arr);
	}

}
