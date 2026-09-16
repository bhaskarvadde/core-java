package com.stringHandling;

public class TestString7 {

	public static void main(String[] args) {
		String str = "";          // Empty String (length = 0)
        String str1 = null;       // Null reference (does not point to any String object)
        String str2 = " ";        // String containing one whitespace character
        String str3 = new String(); // Creates an empty String (same as "")

        // =========================
        // isEmpty()
        // Returns true if the length of the String is 0.
        // =========================

        System.out.println(str.isEmpty());   // true (length is 0)

        // =========================
        // isBlank() (Java 11+)
        // Returns true if the String is empty
        // OR contains only whitespace characters.
        // =========================

        System.out.println(str.isBlank());   // true (empty string)

        System.out.println(str2.isEmpty());  // false (length is 1 because of the space)

        System.out.println(str2.isBlank());  // true (contains only whitespace)

        // The following two statements will throw
        // NullPointerException because str1 is null.
        // A null reference cannot call any methods.

        // System.out.println(str1.isEmpty()); // NullPointerException
        // System.out.println(str1.isBlank()); // NullPointerException

        System.out.println(str3.isEmpty());  // true (new String() creates an empty string)

        System.out.println(str3.isBlank());  // true (empty string is considered blank)
	}

}
