package com.lab;


class Practise {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            count++;
        }

        System.out.println("Number of elements in the array: " + count);
	}
}