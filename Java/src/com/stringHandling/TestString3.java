package com.stringHandling;

//String is immutable which we cannot alter or modify once its created but we can re-assign the values.
//Other than String , what are the classes are immutable?
//All the wrapper classes are immutable	

// String Concatenation
public class TestString3 {

	public static void main(String[] args) {

		String s1 = "Mercedese";
		String s2 = "Benz";

		// concat() creates a NEW String object.
		// It does NOT modify the original String because
		// Strings are immutable.
		s1.concat(s2); // cant alter or modify String

		System.out.println("After trying to modify: " + s1);


		// The newly created String returned by concat()
		// is assigned back to s1.
		s1 = s1.concat(s2); // but we can Re-assign

		System.out.println("After Re-assign: " + s1);


		String s3 = "Luxury";
		String s4 = "Car";

		// concat() joins two Strings and returns
		// a new String object.
		System.out.println("Printing the two values by concat() method: " + s3.concat(s4)); // LuxuryCar


		String s5 = "Karl";
		String s6 = "Benz";

		// '+' is overloaded for Strings.
		// Internally, Java uses StringBuilder for concatenation.
		String s7 = s5 + s6;

		System.out.println(s7);


		// Once a String is encountered,
		// everything after it is treated as a String.
		System.out.println("Sum " + 10 + 40); // String + anything becomes String


		// Parentheses are evaluated first.
		System.out.println("Sum " + (10 + 40)); // BODMAS


		int[] numbers = {10,20,30};

		// Arrays do not override toString(),
		// so Object's toString() is called,
		// which prints ClassName@HexHashCode.
		System.out.println(numbers); // prints Address


		String[] names = {"Bmw","Maserati"};

		// Same reason as above.
		System.out.println(names); // prints Address


		char[] ch = {'A','P','P'};

		// PrintStream.println(char[]) is overloaded.
		// It prints each character instead of the address.
		System.out.println(ch); // APP - so String is a collection of characters

	}

}
