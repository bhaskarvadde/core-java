package com.stringHandling;

public class TestString6 {

	public static void main(String[] args) {
		String name1 = "Java";
		String name2 = "java";

		// contentEquals() compares the actual content of two objects.
		// It can compare a String with another String, StringBuffer, StringBuilder, or
		// any CharSequence.
		// It is case-sensitive.
		System.out.println(name1.contentEquals(name2)); // false

		// equals() compares whether two String objects have exactly the same
		// characters.
		// It is case-sensitive.
		System.out.println(name1.equals(name2)); // false

		// equalsIgnoreCase() compares two strings while ignoring
		// the difference between uppercase and lowercase letters.
		System.out.println(name1.equalsIgnoreCase(name2)); // true
	}

}
