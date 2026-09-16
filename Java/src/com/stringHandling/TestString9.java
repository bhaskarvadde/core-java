package com.stringHandling;

public class TestString9 {

	public static void main(String[] args) {
		String s1 = "Java is simple in VCube in kukatpally JNTU";

        // Returns the index of the first occurrence of 'a'
        System.out.println(s1.indexOf('a'));          // 1

        // Returns the index of the last occurrence of 'a'
        System.out.println(s1.lastIndexOf('a'));      // 33

        // ============================================
        // Finding the 2nd occurrence of 'a'
        // ============================================

        int first = s1.indexOf('a');
        int second = s1.indexOf('a', first + 1);

        System.out.println(second);                  // 3

        // ============================================
        // Finding the 3rd occurrence of 'a'
        // ============================================

        int third = s1.indexOf('a', second + 1);

        System.out.println(third);                   // 31

        // ============================================
        // First occurrence of substring "in"
        // ============================================

        System.out.println(s1.indexOf("in"));        // 15

        // ============================================
        // Second occurrence of substring "in"
        // ============================================

        int firstIn = s1.indexOf("in");
        int secondIn = s1.indexOf("in", firstIn + 1);

        System.out.println(secondIn);                // 24
	}

}
