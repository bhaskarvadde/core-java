package exceptionHandling.UnCheckedExceptions;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main method stated");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		try {
			System.out.println(str.charAt(4));
//			System.out.println(10/0);
//			System.out.println(0.0/0.0); // NaN (Not a Number)
//			System.out.println(10/0.0); // Infinity

		} catch (StringIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.err.println(e);
		}

		System.out.println("main method ended");

	}

}
