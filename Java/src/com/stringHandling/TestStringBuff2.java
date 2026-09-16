package com.stringHandling;

public class TestStringBuff2 {

	public static void main(String[] args) {

		/*
		 * Constructor 1: Creates an empty StringBuffer. Default capacity = 16
		 * characters.
		 */
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // 16

		/*
		 * Constructor 2: Creates a StringBuffer with the given string.
		 *
		 * Capacity = 16 + length of the string
		 *
		 * "Java" length = 4 Capacity = 16 + 4 = 20
		 */
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1.capacity()); // 20

		/*
		 * "Bhaskar" length = 7 Capacity = 16 + 7 = 23
		 */
		StringBuffer sb2 = new StringBuffer("Bhaskar");
		System.out.println(sb2.capacity()); // 23

		/*
		 * Initial capacity = 16 Appending only 7 characters. Since 7 < 16, capacity
		 * does not increase.
		 */

//		StringBuffer sb3 = new StringBuffer();
//		sb3.append("Bhaskar");
//		System.out.println(sb3.capacity()); // 16

		/*
		 * Initial capacity = 16 Appending 17 characters.
		 *
		 * Since 17 > 16, capacity is increased using the formula:
		 *
		 * New Capacity = (Old Capacity × 2) + 2 = (16 × 2) + 2 = 34
		 */
		StringBuffer sb3 = new StringBuffer();
		sb3.append("BhaskarBhaskarBha"); // 17 characters
		System.out.println(sb3.capacity()); // 34

		/*
		 * Initial capacity = 16 Appending 40 characters.
		 *
		 * First expansion: 16 → 34
		 *
		 * Since 40 > 34, StringBuffer expands again.
		 *
		 * Required capacity = 40 Formula gives: (34 × 2) + 2 = 70
		 *
		 * Java chooses the larger of: 1. Required capacity (40) 2. Expanded capacity
		 * (70)
		 *
		 * Therefore, final capacity = 70
		 *
		 * NOTE: If your output shows 40, then count the string length again. Normally
		 * Java prints 70.
		 */
		StringBuffer sb4 = new StringBuffer();
		sb4.append("BhaskarBhaskarBhaskarBhaskarBhaskarBhask");
		System.out.println(sb4.capacity());

		/*
		 * Again starts with capacity = 16.
		 *
		 * As more data is appended, capacity increases whenever needed.
		 *
		 * Expansion Formula: New Capacity = (Old Capacity × 2) + 2
		 *
		 * Example: 16 → 34 34 → 70 70 → 142 142 → 286
		 *
		 * Capacity increases only when the current capacity is insufficient for the new
		 * content.
		 */
		StringBuffer sb5 = new StringBuffer();

		sb5.append("BhaskarBhaskarBhaskarBhaskarBhaskarBhask");
		sb5.append("BhaskarBhaskarBhaskarBhaskarBhaskarBhaskarBhaskar");
		sb5.append("B");

		System.out.println(sb5.capacity());
	}

}
