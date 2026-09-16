package com.consoleprojects;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("GUESS THE NUMBER");
		System.out.println("****************");

		String yn;

		do {

			int randNum = (int) (Math.random() * 10); // 5

			for (int i = 0; i < 3; i++) {

				System.out.print("Guess number: ");
				int num = sc.nextInt();

				if (num == randNum) {
					System.out.println("You got it!!!");
					break;
				} else if (num < randNum) {
					System.out.println("Too low!!!");
				} else if (num > randNum) {
					System.out.println("Too High!!!");
				} else {
					System.out.println("Invalid Data");
				}

			}
			System.out.println("Your chances are over");
			System.out.println("Do you want to play again?");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("yes"));

		System.out.println("Game Over!");

		sc.close();
	}

}