package exceptionHandling.UnCheckedExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");

		try {
			int age = sc.nextInt();
			System.out.println("Your age is: " + age);
		} catch (InputMismatchException e) {
			System.err.println("Please enter a valid integer.");
			e.printStackTrace();
		}

		System.out.println("Program ended");

		sc.close();
	}
}