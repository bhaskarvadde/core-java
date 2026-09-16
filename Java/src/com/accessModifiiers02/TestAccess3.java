package com.accessModifiiers02;

import com.accessModifiiers01.TestAccess1;

/**
 * Demonstrates access modifier behaviour from a DIFFERENT package. TestAccess3
 * extends TestAccess1, so it qualifies as a subclass.
 *
 * Summary from this package: private → not accessible (same as before) default
 * → not accessible (package boundary blocks it) public → accessible
 * (everywhere) protected → NOT accessible via parent reference (t1) BUT
 * accessible via subclass reference (t3) ← the key rule
 */
public class TestAccess3 extends TestAccess1 {

	public static void main(String[] args) {

		TestAccess1 t1 = new TestAccess1(); // parent-type reference

		// ── private members ──────────────────────────────────────────────────
		// Never accessible outside TestAccess1. No change from before.
		// System.out.println(t1.name1); CE: not visible
		// System.out.println(t1.id1); CE: not visible
		// t1.method1(); CE: not visible

		// ── default members ──────────────────────────────────────────────────
		// Blocked by the package boundary — even though TestAccess1 is public,
		// its default members belong to com.accessModifiers01 only.
		// System.out.println(t1.name2); CE: not visible
		// System.out.println(t1.id2); CE: not visible
		// t1.method2(); CE: not visible

		// ── public members ───────────────────────────────────────────────────
		// Still accessible — public has no boundary at all.
		System.out.println(t1.name3);
		System.out.println(t1.id3);
		t1.method3();

		// ── protected via PARENT reference (t1) — NOT allowed ────────────────
		// Even though we are in a subclass, using a TestAccess1 reference
		// to access protected members from a different package is a compile error.
		// The JVM cannot guarantee t1 refers to a TestAccess3 instance.
		//
		// System.out.println(t1.name4); CE: The field TestAccess1.name4 is not visible
		// System.out.println(t1.id4); CE: The field TestAccess1.id4 is not visible
		// t1.method4(); CE: The method method4() is not visible

		// ── protected via SUBCLASS reference (t3) — allowed ──────────────────
		// This is the ONLY way to access protected members outside the package:
		// through a reference of the subclass type itself (TestAccess3).
		// JVM now knows for certain this object IS a TestAccess3.
		TestAccess3 t3 = new TestAccess3();

		System.out.println(t3.name4); // inherited protected field
		System.out.println(t3.id4); // inherited protected field
		t3.method4(); // inherited protected method
	}
}








































//package com.accessModifiiers02;
//
//// to access the class data in another package we must import that package
//import com.accessModifiiers01.TestAccess1;
//
//public class TestAccess3 extends TestAccess1 {
//
//	public static void main(String[] args) {
//		TestAccess1 t1 = new TestAccess1();
//
//		// Accessing the default data outside of the package is not possible , even
//		// though class is public
//// we cannot access default data outside of the package /
/// System.out.println(t1.name2); / System.out.println(t1.id2); / t1.method2();
//
//		// Accessing the public data outside of the package by using object reference
//		// variable
//		System.out.println(t1.name3);
//		System.out.println(t1.id3);
//		t1.method3();
//
//		// Accessing the protected data data outside of the package is not possible
//// System.out.println(t1.name4); The field TestAccess1.name4 is not visible /
/// System.out.println(t1.id4); The field TestAccess1.id4 is not visible /
/// t1.method4(); The method method4() is undefined for the type TestAccess3
//
//// Accessing protected data outside of the package is not possible directly /
/// we can access outside of the packages of sub classes with sub class object
/// reference (not with parent object)
//		TestAccess3 t3 = new TestAccess3();
//
//		// Accessing the protected data outside of the package
//		System.out.println(t3.name4);
//		System.out.println(t3.id4);
//		t3.method4();
//	}
//
//}
