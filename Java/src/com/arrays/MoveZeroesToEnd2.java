package com.arrays;

//Optimized

//Two Pointer Pattern
//Here:
//
//i scans every element (exploration pointer).
//count tracks where the next non-zero element should be placed (placement pointer).
//
//So you effectively have two indices moving through the array, which is why it's considered a two-pointer technique.

public class MoveZeroesToEnd2 {
	
	void moveZeroesToEnd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[count] = arr[i];
				count += 1; 
			}
		}

		while(count < arr.length) {
			arr[count] = 0;
			count++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");  
		}
		
		// TC : O(n) 
		// SC : O(1)  
	}

	void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		moveZeroesToEnd(arr);
	}

}
