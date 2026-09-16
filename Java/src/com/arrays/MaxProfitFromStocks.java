package com.arrays;

public class MaxProfitFromStocks {

	public static void main(String[] args) {

		int[] arr = { 1, 13, 2, 7, 17, -22, 1 };

		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int maxProfit = 0;

		String buyDay = "";
		String sellDay = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int profit = arr[j] - arr[i];

				if (profit > maxProfit) {

					maxProfit = profit;
					buyDay = days[i];
					sellDay = days[j];
				}
			}
		}

		System.out.println("Buy Day  : " + buyDay);
		System.out.println("Sell Day : " + sellDay);
		System.out.println("Max Profit : " + maxProfit);
	}
}
