package com.stringHandling;

public class TestString2 {

	public static void main(String[] args) {
//		way 3
//		3. with New Keyword
		String s1 = new String();

		// Initializes a newly created String Object
		// so that it represents an empty character sequence
		System.out.println("s1 " + s1); // prints empty line


		// When we create a String using the new keyword,
		// JVM first checks whether the literal already exists in the
		// String Constant Pool (SCP).
		//
		// If the literal does NOT exist:
		// 1. A String object is created in the SCP.
		// 2. Another String object is created in the Heap.
		//
		// Total Objects Created = 2
		String s2 = new String("Mitsibishi");
		System.out.println("s2 " + s2);


		// 0 new Objects because "Mitsibishi" is already present
		// in the String Constant Pool.
		// s3 simply points to the existing SCP object.
		String s3 = "Mitsibishi";
		System.out.println("s3 " + s3);


		// The literal already exists in SCP.
		// Therefore:
		// SCP Object  -> Reused
		// Heap Object -> Newly Created
		//
		// Total New Objects Created = 1
		String s4 = new String("Mitsibishi");
		System.out.println("s4 " + s4);


		// == compares memory addresses (references)
		// s2 points to Heap object
		// s3 points to SCP object
		System.out.println(s2 == s3); // false


		// s3 points to SCP
		// s4 points to Heap
		System.out.println(s3 == s4); // false

	}

}

//Final Memory Layout

//STACK
//-----------------------------
//s1
//s2
//s3
//s4
//-----------------------------
//|    |     |      |
//|    |     |      |
//|    |     |      |
//|    |     |      |
//v    v     |      v
//
//HEAP
//+------------------------+
//| ""                     | <---- s1
//+------------------------+
//
//+------------------------+
//| "Mitsibishi"           | <---- s2
//+------------------------+
//
//+------------------------+
//| "Mitsibishi"           | <---- s4
//+------------------------+
//
//
//String Constant Pool (SCP)
//+------------------------+
//| "Mitsibishi"           | <---- s3
//+------------------------+



//Reference Comparison
//s2 == s3
//
//s2 --> Heap Object
//s3 --> SCP Object
//
//Different addresses
//Result : false
//s3 == s4
//
//s3 --> SCP Object
//s4 --> Heap Object
//
//Different addresses
//Result : false







