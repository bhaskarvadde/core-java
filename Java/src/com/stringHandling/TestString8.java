package com.stringHandling;

public class TestString8 {

	public static void main(String[] args) {
		// String literal is stored in the String Constant Pool (SCP)
		String s1 = "Java";

		// Creates a new String object in the Heap memory
		String s2 = new String("Java");

		// == compares object references (memory addresses)
		// s1 points to SCP, s2 points to Heap
		System.out.println(s1 == s2); // false

		// intern() returns the reference of the String
		// from the String Constant Pool (SCP).
		// If the string does not exist in SCP, it is added.
		s2 = s2.intern();

		// Now both s1 and s2 point to the same SCP object.
		System.out.println(s1 == s2); // true

		// Another example
		String s3 = "Bhaskar"; // SCP
		String s4 = new String("Bhaskar"); // Heap

		System.out.println(s3 == s4); // false

		// Calling intern() on s3 has no effect because
		// s3 is already pointing to the SCP object.
		s3 = s3.intern();

		System.out.println(s3 == s4); // false

		// If we want s4 to point to the SCP object:
		s4 = s4.intern();

		System.out.println(s3 == s4); // true

		// intern() returns the reference to the String Constant Pool (SCP).
		// If the string is not already in the SCP, it is added there.
		// It can be called on any String object, but it always returns an SCP
		// reference.
	}

}
