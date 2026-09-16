package com.logicalStatements.switchh;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day");
		int day = sc.nextInt();

		String res = switch(day) {
		case 1 -> {
			System.out.println("Weekend");
			yield "Sunday"; // Switch Returning
		}
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "Invalid";
		}; 
		
		System.out.println(res);
	}
}
