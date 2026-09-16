package com.accessModifiiers01;

/**
 * Demonstrates access modifier behaviour from OUTSIDE TestAccess1, but still
 * within the SAME package (com.accessModifiers01).
 *
 * What changes compared to TestAccess1's own main(): private → NOT accessible
 * here (compile error if uncommented) default → accessible (same package)
 * public → accessible (everywhere) protected → accessible (same package — no
 * inheritance needed here)
 */
public class TestAccess2 {

	public static void main(String[] args) {

		// Constructor is public → object creation works fine.
		// If TestAccess1's constructor were private, this line would give:
		// CE: "The constructor TestAccess1() is not visible"
		TestAccess1 t1 = new TestAccess1();

		// ── private members ──────────────────────────────────────────────────
		// NOT accessible outside TestAccess1, even from the same package.
		// Uncommenting any of these gives a compile error:
		// "The field/method TestAccess1.xxx is not visible"
		//
		// System.out.println(t1.name1);
		// System.out.println(t1.id1);
		// t1.method1();

		// ── default members ──────────────────────────────────────────────────
		// Accessible because TestAccess2 is in the SAME package.
		// (Outside this package, these would also become invisible.)
		System.out.println(t1.name2);
		System.out.println(t1.id2);
		t1.method2();

		// ── public members ───────────────────────────────────────────────────
		// Accessible from anywhere — same package, different package, subclass,
		// anywhere.
		System.out.println(t1.name3);
		System.out.println(t1.id3);
		t1.method3();

		// ── protected members ────────────────────────────────────────────────
		// Accessible here because we are in the SAME package.
		// Outside this package, protected is only accessible through a subclass
		// reference.
		System.out.println(t1.name4);
		System.out.println(t1.id4);
		t1.method4();
	}
}































//package com.accessModifiiers01;
//
//public class TestAccess2 {
//
//	public static void main(String[] args) {
////		if we use private TestAccess1
////		The constructor TestAccess1() is not visible CE:
////		TestAccess1 t1 = new TestAccess1();
//
////		if the data is default we can access the data outside of the class
//		TestAccess1 t1 = new TestAccess1();
//
////		Accessing the data outside the class by using object reference variable is not possible
////		with private keyword, we are stopping the direct access
////		Note: So, private data we cannot access outside of the classes
////		System.out.println(t1.name1); // The field TestAccess1.name1 is not visible
////		System.out.println(t1.id); // The field TestAccess1.id is not visible
////		t1.method1(); // The method method1() from the type TestAccess1 is not visible
//
//		// Accessing the default data outside of the class by using object reference
//		// variable
//		System.out.println(t1.name2);
//		System.out.println(t1.id2);
//		t1.method2();
//
//		// Accessing the default data within the package by using object reference
//		// variable
//		System.out.println(t1.name2);
//		System.out.println(t1.id2);
//		t1.method2();
//
//		// Accessing the public data within the same package by using object reference
//		// variable
//		System.out.println(t1.name3);
//		System.out.println(t1.id3);
//		t1.method3();
//
//		// Accessing the protected data within the same package 
//		System.out.println(t1.name4);
//		System.out.println(t1.id4);
//		t1.method4(); 
//
//	}
//
//}
