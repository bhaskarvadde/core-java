package exceptionHandling.UnCheckedExceptions;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int a = sc.nextInt();

		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {

//			System.err.println(e); // e.toString()

//			System.out.println(e.getMessage());

			e.printStackTrace();

		}

		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
	}

}
