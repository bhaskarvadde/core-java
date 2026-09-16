package com.stringHandling;

public class TestStringBuffer3 {

	public static void main(String[] args) {
		// Creates a StringBuffer object with the initial value "Bhaskar"
		StringBuffer sb1 = new StringBuffer("Bhaskar");

		/*
		 * delete(startIndex, endIndex) Deletes characters from startIndex (inclusive)
		 * to endIndex (exclusive).
		 *
		 * String : B h a s k a r Index : 0 1 2 3 4 5 6
		 *
		 * delete(3,7) removes characters at indexes 3,4,5,6 i.e., "skar"
		 *
		 * Remaining String = "Bha"
		 */
		System.out.println(sb1.delete(3, 7)); // Bha

		/*
		 * deleteCharAt(index) Deletes the character at the specified index.
		 *
		 * Current String = "Bha" Index: B -> 0 h -> 1 a -> 2
		 *
		 * Deletes 'a'
		 */
		System.out.println(sb1.deleteCharAt(2)); // Bh

		// Creates an empty StringBuffer
		StringBuffer sb2 = new StringBuffer();

		/*
		 * ensureCapacity(100) Ensures that the buffer can hold at least 100 characters.
		 *
		 * Default capacity = 16 Since 100 > 16, capacity becomes at least 100.
		 */
		sb2.ensureCapacity(100);

		// Prints the current capacity
		System.out.println(sb2.capacity()); // 100

		// Creates a character array of size 10
		char[] ch = new char[10];

		// Creates a StringBuffer with text
		StringBuffer sb3 = new StringBuffer("Java is simple in vcube");

		/*
		 * getChars(srcBegin, srcEnd, destinationArray, destBegin)
		 *
		 * Copies characters from the StringBuffer into the destination character array.
		 *
		 * srcBegin = 0 srcEnd = 4 (exclusive)
		 *
		 * Copies: J a v a
		 *
		 * into ch[] starting at index 0.
		 */
		sb3.getChars(0, 4, ch, 0);

		// Prints the character array
		// Remaining positions contain default '\u0000' (null characters)
		System.out.println(ch); // Java

		/*
		 * reverse() Reverses the entire StringBuffer.
		 */
		System.out.println(sb3.reverse());

		// Output:
		// ebucv ni elpmis si avaJ
	}

}
