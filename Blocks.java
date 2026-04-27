package com.javaintroduction;

public class Blocks {
	static Blocks obj = new Blocks(); // first preference for static variables

	{
		System.out.println("instance block loaded"); // Third preference for instance block
	}

	static {
		System.err.println("static block loaded"); // Second preference for static Blocks
	}

	public static void main(String[] args) {
		System.out.println("main method started!");
	}

}
