package com.accessModifiiers01;

/**
 * Demonstrates all four Java access modifiers:
 *
 * private → same class only default → same class + same package (no keyword
 * written) protected → same class + same package + subclasses outside the
 * package (only accessible through a subclass reference, not a parent-type
 * reference) public → everywhere
 *
 * Rules for TOP-LEVEL classes (non-nested): Allowed: public | default (no
 * keyword) NOT allowed: private | protected → Writing "private class Foo {}" at
 * top level gives a compile error: "Illegal modifier for class Foo; only
 * public, abstract & final are permitted"
 *
 * Same rule applies to top-level interfaces — they cannot be private.
 */

// A top-level interface — only public or default allowed here
interface In1 {
	// interface body
}

public class TestAccess1 {

	// ── private members ─────────────────────────────────────────────────────
	// Accessible only inside TestAccess1. Using them anywhere else is a compile
	// error.
	private String name1 = "Bhaskar";
	private int id1 = 10;

	private void method1() {
		System.out.println("method1 called");
	}

	// ── default members (no keyword) ─────────────────────────────────────────
	// Accessible inside TestAccess1 AND any class in the same package.
	String name2 = "Vishwa";
	int id2 = 20;

	void method2() {
		System.out.println("method2 called");
	}

	// ── public members ───────────────────────────────────────────────────────
	// Accessible everywhere in the project.
	public String name3 = "Praveen";
	public int id3 = 30;

	public void method3() {
		System.out.println("method3 called");
	}

	// ── protected members ────────────────────────────────────────────────────
	// Accessible inside this class, inside this package,
	// AND in subclasses outside the package — but only via a subclass reference.
	protected String name4 = "Sandhya";
	protected int id4 = 40;

	protected void method4() {
		System.out.println("method4 called");
	}

	// ── constructors ─────────────────────────────────────────────────────────
	/*
	 * If the constructor is PRIVATE: → Objects cannot be created from outside the
	 * class. → This is the basis of the Singleton Design Pattern:
	 * "Only one object exists no matter how many times it is requested." (Single =
	 * one, -ton = many)
	 *
	 * private TestAccess1() { ... } ← would enforce Singleton
	 */

	// Public constructor — objects can be created from anywhere
	public TestAccess1() {
		System.out.println("TestAccess1 constructor called");
	}

	/*
	 * Note: static blocks and instance blocks CANNOT have access modifiers. Writing
	 * "private static { ... }" or "private { ... }" is a compile error:
	 * "Syntax error, insert Identifier to complete CompactConstructorHeader"
	 */

	// ── main method ───────────────────────────────────────────────────────────
	public static void main(String[] args) {
		System.out.println("main method started");

		TestAccess1 t1 = new TestAccess1();

		// private — accessible here because we are INSIDE the same class
		System.out.println(t1.name1);
		System.out.println(t1.id1);
		t1.method1();

		// default — accessible here (same class, same package)
		System.out.println(t1.name2);
		System.out.println(t1.id2);
		t1.method2();

		// public — accessible everywhere
		System.out.println(t1.name3);
		System.out.println(t1.id3);
		t1.method3();

		// protected — accessible here (same class)
		System.out.println(t1.name4);
		System.out.println(t1.id4);
		t1.method4();
	}

	// ── inner class ───────────────────────────────────────────────────────────
	/*
	 * A class declared inside another class is called an Inner Class. Inner classes
	 * CAN use private (unlike top-level classes). Use case: providing helper logic
	 * that only the outer class needs — it shouldn't be visible to the outside
	 * world.
	 */
	private class TestAcc {
		// inner class body
	}
}

//Modifier		Class	Interface	Inner class	Variables	Methods	Blocks	Constructors	Scope / purpose
//
//Access modifiers  control visibility across classes and packages
//----------------------------------------------------------------
//private		  ✗			✗			✓			✓		  ✓		  ✗	 		✓		Same class only
//default	    	  ✓			✓			✓			✓		  ✓		  ✓			✓		Same package only (no keyword written)
//protected	  ✗			✗			✓			✓		  ✓		  ✗			✓		Same package + subclasses outside (via subclass ref)
//public		  ✓			✓			✓			✓		  ✓		  ✗			✓		Everywhere in the project 
//
//OOP & design modifiers  control structure, sharing, and precision
//------------------------------------------------------------------
//abstract	✓	✓	✓	✗	✓	✗	✗	Cannot instantiate; method has no body — subclass must implement
//static	✗	✗	✓	✓	✓	✓	✗	Belongs to class, not instance; shared across all objects
//strictfp	✓	✓	✓	✗	✓	✗	✗	Forces IEEE 754 strict floating-point on all operations
//synchronized	✗	✗	✗	✗	✓	✓	✗	Thread safety — only one thread executes at a time
//
//Field & JVM modifiers  control memory, JIT, and native behaviour
//-----------------------------------------------------------------
//transient	✗	✗	✗	✓	✗	✗	✗	Skip this field during serialization
//volatile	✗	✗	✗	✓	✗	✗	✗	Read/write directly from main memory — no CPU cache
//native	✗	✗	✗	✗	✓	✗	✗	Method implemented in C/C++ via JNI — no Java body
//final	✓	✗	✓	✓	✓	✗	✗	Class: can't extend · Method: can't override · Variable: can't reassign
























//package com.accessModifiiers01;
//
////Scope of 
////- Private = is within the class only, we cannot access outside class
////- Default or undefined = is within the class + within the Package , we cannot access outside of the package
////- Protected = within class + package, outside of the package of sub classes with sub class object reference only
////- Public = within the class + package + project , everywhere within the package
//
////if we use Private Access modifier, we will get below CE : 
////Illegal modifier for the class TestAccess1; only <default> public, strictfp, abstract & final are permitted
//
////Note : <default> means undefined,
////whenever we are not giving any access modifiers for class or data members then we will consider 
////it as a <default> or undefined
//
////Private - No for Interfaces
////Illegal modifier for the interface In1; only <default>, public, strictfp & abstract are permitted
//interface In1 {
//
//}
//
//public class TestAccess1 {
//
//	// Private Data Members
//	// Data Members : methods + variables
//	private String name1 = "Bhaskar";
//	private int id = 10;
//
//	private void method1() {
//		System.out.println("method1 called");
//	}
//
////	Default Data
//	String name2 = "Vishwa";
//	int id2 = 20;
//
//	void method2() {
//		System.out.println("method2 called");
//	}
//
////	public data
//	public String name3 = "Praveen";
//	public int id3 = 30;
//
//	public void method3() {
//		System.out.println("method3 called");
//	}
//
////	protected data
//	protected String name4 = "Sandhya";
//	protected int id4 = 40;
//
//	protected void method4() {
//		System.out.println("method4 called");
//	}
//
////	Syntax error, insert "Identifier" to complete CompactConstructorHeader 
////	private static {
////		System.out.println("static block called");
////	}
//
////	Syntax error, insert "Identifier" to complete CompactConstructorHeader
////	private {
////		System.out.println("instance block called"); 
////	}
//
////	No arg constructor with the scope of default
////	TestAccess1() {
////		System.out.println("TestAccess1 Constructor called");
////	}
//
////	No arg constructor with the scope of private
////	if the constructor is private, we cannot create objects outside of the class
////	whenever we want to create only one object for multiple requests then we can go for the concept called
////	Singleton design pattern, if we want to achieve this pattern we must need to keep your class constructor as private
////Single = one - ton = 100's of 
////	private TestAccess1() {
////		System.out.println("TestAccess1 Constructor called");
////	}
//
////	default constructor scope is class scope 
//	public TestAccess1() {
//		System.out.println("TestAccess1 Constructor called");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main method started");
//
//		// creating object of TestAccess1
//		TestAccess1 t1 = new TestAccess1();
//
//		// Accessing the private data within the class by using object reference
//		// variable
//		System.out.println(t1.name1);
//		System.out.println(t1.id);
//		t1.method1();
//
//		// Accessing the default data within the class by using object reference
//		// variable
//		System.out.println(t1.name2);
//		System.out.println(t1.id2);
//		t1.method2();
//
//		// Accessing the public data within the class by using object reference
//		// variable
//		System.out.println(t1.name3);
//		System.out.println(t1.id3);
//		t1.method3();
//
//		// Accessing the public data within the class by using object reference
//		// variable
//		System.out.println(t1.name4);
//		System.out.println(t1.id4);
//		t1.method4(); 
//
//	}
//
//	// Inner Classes : A class inside a class is called Inner Class
//	// for providing temporary solutions for outer classes we need to use Inner
//	// classes
//
//	// Inner Classes:
//	private class TestAcc {
//
//	}
//
//}