package com.arrays;

import java.util.Scanner;

public class LargestElement {

	static int findLargeNum(int[] nums) {

		int largest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}

		return largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter num "+ (i+1) ); 
			nums[i] = sc.nextInt();
		}

		int largest = findLargeNum(nums);

		System.out.println("Largest Elements is : " + largest);
	}

}
