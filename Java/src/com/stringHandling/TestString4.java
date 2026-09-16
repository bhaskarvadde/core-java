package com.stringHandling;
//String methods

//2. int codePointAt(int index) - Returns the character (Unicode code point) at the specified index.
//3. int codePointBefore(int index) - Returns the character (Unicode code point) before the specified index.
//4. int	 codePointCount(int beginIndex, int endIndex) - Returns the number of Unicode code points in the specified text range of this String.
//5. int	compareTo(String anotherString) - Compares two strings lexicographically.
//6. int	compareToIgnoreCase(String str)-Compares two strings lexicographically, ignoring case differences.
//7. String	concat(String str)-Concatenates the specified string to the end of this string.

public class TestString4 {

	public static void main(String[] args) {
		String str = "Java is simple";
		
//		2. codePointAt()
		System.out.println(str.codePointAt(1)); // 97
		
//		3. codePointBefore()
		System.out.println(str.codePointBefore(1)); // 74
		
//		4. codePointCount()
		System.out.println(str.codePointCount(1, 6)); // 5
		
		String str1 = "Advaith";
		String str2 = "Abhigna";
		
//		5. compareTo()
		System.out.println(str1.compareTo(str2)); // 2
//		Why 2?
//
//				Because the first differing characters are:
//
//				d - b
//				100 - 98 = 2
//
//				Java stops comparing after finding the first difference.
		
		
		String str3 = "Java";//74
		String str4 = "java";//106
		
		System.out.println(str3.compareTo(str4)); // 74-106 = -32
//		the diff for small char to Capital char will always be -32
		
//		6. compareToIgnoreCase()
		System.out.println(str3.compareToIgnoreCase(str4)); 
		
		String str5 = "Bhaskar"; // length - 7
		String str6 = "Bha"; // length - 3
		
		System.out.println(str5.compareTo(str6)); // 7-3 = 4 
		
		int a = 10;
		String name = "Mercedese";
		String name1 = "Gwagon";
		
//		7. concat()
		System.out.println(name.concat("10")); //Mercedese10
		System.out.println(name+10); //Mercedese10
		 
		name.concat(name1);
		System.out.println(name); // Mercedese
		System.out.println(name.concat(name1)); //MercedeseGwagon
		
	}

}
