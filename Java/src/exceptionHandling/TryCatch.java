package exceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int a = sc.nextInt();

		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		try {
			System.out.println(a / b);
		} catch (Exception e) {

//			Prints the exception object.
//
//			Internally, it calls:
//
//			e.toString();
//
//			The toString() method returns:
//
//			ExceptionClassName: Message

//			Output
//			java.lang.ArithmeticException: / by zero
			System.err.println(e); // e.toString()

			System.out.println("************************");
			
//			Prints only the exception message.
//
//			It does not print the exception class name.
//
//			Output
//			/ by zero

			System.out.println(e.getMessage());
			
			System.out.println("************************");

//			e.printStackTrace();
//			What it does
//
//			Prints
//
//			Exception type
//			Message
//			Method names
//			File names
//			Line numbers
//			Complete call stack
//			Output
//			java.lang.ArithmeticException: / by zero
//			    at Demo.main(Demo.java:8)
//
//			If methods call other methods:
//
//			main()
//			   ↓
//			calculate()
//			   ↓
//			divide()
//
//			Then output becomes
//
//			java.lang.ArithmeticException: / by zero
//			    at Demo.divide(Demo.java:18)
//			    at Demo.calculate(Demo.java:12)
//			    at Demo.main(Demo.java:6)

			e.printStackTrace();
			
			System.err.println("************************");

		}

		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
	}

}
