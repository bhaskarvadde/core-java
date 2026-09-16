package com.caseStudies;

public class Theatre {

	public static void main(String[] args) {

		int availableSeats = 0;

		for (int i = 1; i <= 100; i++) {

			if (i == 0 || i == 7 || i == 15 || i == 26 || i == 35 || i == 56 || i == 68 || i == 79 || i == 89 || i == 85
					|| i == 91 || i == 99) {
				System.out.println("Seat " + i + " : Booked");
			} else {
				System.out.println("Seat " + i + " : Available");
				availableSeats++;
			}
		}

		System.out.println("\nAvailable Seats = " + availableSeats);
	}
}
