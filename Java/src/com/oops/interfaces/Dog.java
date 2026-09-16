package com.oops.interfaces;

// Dog class signs the Animal contract.
// Because of "implements Animal",
// Dog MUST implement all abstract methods.

public class Dog implements Animal {

	// @Override tells the compiler:
	// "I am implementing/overriding the method declared
	// in the Animal interface."

	@Override
	public void sound() {

		// IMPLEMENTATION starts here.
		// Animal interface only declared sound().
		// Dog decides HOW it should work.

		System.out.println("Dog sounds Bow bow");
	}

	@Override
	public void drink() {

		// Dog's own implementation

		System.out.println("Dog drinks water");
	}

	@Override
	public void eat() {

		// Dog's own implementation

		System.out.println("Dog eats Pedegree");
	}

}