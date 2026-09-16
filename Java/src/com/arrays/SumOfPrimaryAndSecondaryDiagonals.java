package com.arrays;

//Write a Java program to find the sum of primary and secondary diagonals?
//Input: {{1,2,3},{4,5,6},{7,8,9}}
//Output: sum = 25

//1 2 3
//4 5 6
//7 8 9

public class SumOfPrimaryAndSecondaryDiagonals {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		int leftSum = 0;
//		int rightSum = 0;
		int n = arr.length - 1;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i][i];
			sum += arr[i][arr.length - 1 - i];

//			sum = leftSum + rightSum;
		}

//			if(n %2 !=0) {
//				sum = leftSum + rightSum;
		sum = sum - arr[n / 2][n / 2];

		System.out.println(sum);
	}

}
