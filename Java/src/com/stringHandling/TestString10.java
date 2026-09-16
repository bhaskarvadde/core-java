package com.stringHandling;

public class TestString10 {

	public static void main(String[] args) {
		 // Original String
        String s1 = "Java";

        // getBytes()
        // Converts the String into a byte array.
        // Each byte represents the ASCII/UTF-8 value of the character.
        byte[] arrBytes = s1.getBytes();

        // ============================================
        // Printing ASCII values of each character
        // ============================================
        for (byte b : arrBytes) {
            System.out.println(b);
        }

        System.out.println();

        // ============================================
        // Converting ASCII values back to characters
        // ============================================
        for (byte b : arrBytes) {
            System.out.println((char) b);
        }

        System.out.println();

        // ============================================
        // Printing the String in reverse order
        // ============================================
        for (int i = arrBytes.length - 1; i >= 0; i--) {
            System.out.print((char) arrBytes[i] + " ");
        }
	}

}
