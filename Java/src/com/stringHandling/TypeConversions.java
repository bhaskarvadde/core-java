package com.stringHandling;

public class TypeConversions {

	public static void main(String[] args) {

		/*===========================================
		  STRING TO PRIMITIVE DATA TYPES
		===========================================*/

		String str = "123";

		// String -> int
		int i = Integer.parseInt(str);
		System.out.println("String to int : " + i);

		// String -> long
		long l = Long.parseLong(str);
		System.out.println("String to long : " + l);

		// String -> double
		double d = Double.parseDouble(str);
		System.out.println("String to double : " + d);

		// String -> float
		float f = Float.parseFloat(str);
		System.out.println("String to float : " + f);

		// String -> short
		short s = Short.parseShort(str);
		System.out.println("String to short : " + s);

		// String -> byte
		byte b = Byte.parseByte(str);
		System.out.println("String to byte : " + b);

		// String -> boolean
		String bool = "true";
		boolean flag = Boolean.parseBoolean(bool);
		System.out.println("String to boolean : " + flag);

		// String -> char
		String chStr = "A";
		char ch = chStr.charAt(0);
		System.out.println("String to char : " + ch);



		/*===========================================
		  PRIMITIVE DATA TYPES TO STRING
		===========================================*/

		int a = 100;
		long l1 = 200L;
		double d1 = 45.67;
		float f1 = 12.5f;
		short s1 = 50;
		byte b1 = 10;
		boolean flag1 = false;
		char c1 = 'Z';

		System.out.println("\nPrimitive to String");

		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(l1));
		System.out.println(String.valueOf(d1));
		System.out.println(String.valueOf(f1));
		System.out.println(String.valueOf(s1));
		System.out.println(String.valueOf(b1));
		System.out.println(String.valueOf(flag1));
		System.out.println(String.valueOf(c1));



		/*===========================================
		  PRIMITIVE TO WRAPPER (AUTO BOXING)
		===========================================*/

		Integer integerObj = Integer.valueOf(a);
		Double doubleObj = Double.valueOf(d1);
		Float floatObj = Float.valueOf(f1);
		Long longObj = Long.valueOf(l1);
		Short shortObj = Short.valueOf(s1);
		Byte byteObj = Byte.valueOf(b1);
		Boolean booleanObj = Boolean.valueOf(flag1);
		Character characterObj = Character.valueOf(c1);



		/*===========================================
		  WRAPPER TO PRIMITIVE (AUTO UNBOXING)
		===========================================*/

		int intValue = integerObj;
		double doubleValue = doubleObj;
		float floatValue = floatObj;
		long longValue = longObj;
		short shortValue = shortObj;
		byte byteValue = byteObj;
		boolean booleanValue = booleanObj;
		char charValue = characterObj;

		System.out.println("\nWrapper to Primitive");

		System.out.println(intValue);
		System.out.println(doubleValue);
		System.out.println(floatValue);
		System.out.println(longValue);
		System.out.println(shortValue);
		System.out.println(byteValue);
		System.out.println(booleanValue);
		System.out.println(charValue);



		/*===========================================
		  CHAR TO INT & INT TO CHAR
		===========================================*/

		char c = 'A';

		// char -> int (ASCII/Unicode value)
		int ascii = c;
		System.out.println("\nChar to int : " + ascii);

		// int -> char
		int num = 66;
		char letter = (char) num;
		System.out.println("Int to char : " + letter);



		/*===========================================
		  NUMBER TO NUMBER CONVERSIONS
		===========================================*/

		int x = 25;

		// int -> double
		double d2 = x;

		// int -> float
		float f2 = x;

		// double -> int
		double d3 = 98.76;
		int y = (int) d3;

		System.out.println("\nNumber Conversions");

		System.out.println("int to double : " + d2);
		System.out.println("int to float : " + f2);
		System.out.println("double to int : " + y);
	}
}
