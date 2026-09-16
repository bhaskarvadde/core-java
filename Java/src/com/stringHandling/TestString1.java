package com.stringHandling;

public class TestString1 {

	public static void main(String[] args) {

		// way 1
		// 1. String Literals
		// String Constant Pool will create 1 object
		// because "Cadilac" is not present in the SCP.
		String s = "Cadilac";

		// 0 Objects
		// "Cadilac" already exists in the SCP.
		// s1 simply refers to the existing SCP object.
		String s1 = "Cadilac";

		// 0 Objects
		// Reuses the same SCP object.
		String s2 = "Cadilac";

		// 0 Objects
		// Reuses the same SCP object.
		String s3 = "Cadilac";

		// == compares references (memory addresses)
		// Both variables point to the same SCP object.
		System.out.println(s == s1); // true
		System.out.println(s1 == s2); // true

		System.out.println();

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println();

		// way 2
		// 2. Re-assigning

		// "Porsche" is not present in the SCP,
		// so a new object is created in the SCP.
		//
		// Only the reference variable s2 changes.
		// The original "Cadilac" object remains unchanged because
		// Strings are immutable.
		s2 = "Porsche";

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}


//Final Memory Layout

//
//STACK
//---------------------
//s
//s1
//s2
//s3
//---------------------
//|    |      |     |
//|    |      |     |
//|    |      |     |
//|    |      |     |
//|    |      |     |
//|    |      |     |
//v    v      |     v
//"Cadilac" <----+-----------+
//     |           |
//     |           |
//     |           |
//     v           |
// String Constant Pool
//
//+----------------------+
//| "Cadilac"            |
//+----------------------+
//| "Porsche"            |
//+----------------------+
//       ^
//       |
//      s2


//Why s2 Changes but Others Don't?
//
//Before reassignment:
//
//s  ----\
//s1 -----\
//s2 -------> "Cadilac"
//s3 -----/
//
//After:
//
//s2 = "Porsche";
//s  ----\
//s1 -----\
//s3 -------> "Cadilac"
//
//s2 --------> "Porsche"
//
//The "Cadilac" object is not modified. Only the reference stored in s2 changes. This is possible 
//because Strings in Java are immutable.






