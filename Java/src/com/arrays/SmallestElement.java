package com.arrays;

import java.util.Scanner;

public class SmallestElement {
	
	static int findLeastNum(int[] nums) {
		int leastNum = nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<leastNum) {
				leastNum = nums[i];
			}
		}
		
		return leastNum; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i=0;i<n;i++) { 
			System.out.println("enter num " + (i+1)); 
			nums[i] = sc.nextInt(); 
		}
		
		int leastNum = findLeastNum(nums);
		
		System.out.println("Least num is :"+leastNum); 
	}

}
