package com.arrays;

public class SumAndAvg {

	public static void main(String[] args) {
		int[] marks = { 48, 87, 64, 79, 99 };

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		avg = sum / marks.length;

		System.out.println("Total Marks: " + sum);
		System.out.println("Average: " + avg);
	}

}
