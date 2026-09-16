package com.stringHandling;

public class PrintDuplicates {

	public static void main(String[] args) {

		// Input string
		String str = "programming";

		// Stores duplicate characters without repeating them
		String res = "";

		// Traverse each character in the string
		for (int i = 0; i < str.length(); i++) {

			// Get the current character
			char c = str.charAt(i);

			/*
			 * Condition 1:
			 * str.indexOf(c) != str.lastIndexOf(c)
			 * Checks whether the character appears more than once.
			 *
			 * Example:
			 * 'g' in "programming"
			 * indexOf('g') = 3
			 * lastIndexOf('g') = 10
			 * Since they are different, 'g' is a duplicate.
			 *
			 * Example:
			 * 'p'
			 * indexOf('p') = 0
			 * lastIndexOf('p') = 0
			 * Same index, so it is not a duplicate.
			 *
			 * Condition 2:
			 * res.indexOf(c) == -1
			 * Checks whether the duplicate character is already stored in 'res'.
			 * This prevents printing the same duplicate multiple times.
			 */
			if (str.indexOf(c) != str.lastIndexOf(c) && res.indexOf(c) == -1) {

				// Add the duplicate character to the result
				res += c;
			}
		}

		// Print all duplicate characters
		System.out.println(res);
	}
}
