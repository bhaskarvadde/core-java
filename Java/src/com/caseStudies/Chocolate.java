package com.caseStudies;

public class Chocolate {

	static int getTotalChocolates() {
		int budget = 20;
		int eachChocCost = 2;
		int totalChocolates = budget / eachChocCost;
		int wrappers = totalChocolates;

		while (wrappers >= 3) {
			int freeChoclates = wrappers / 3;
			totalChocolates += freeChoclates;

			wrappers = (wrappers % 3) + freeChoclates;
		}

		return totalChocolates;
	}

	public static void main(String[] args) {
		int totalChocolates = getTotalChocolates();

		System.out.println("Total Chocolates = " + totalChocolates);
	}

}
