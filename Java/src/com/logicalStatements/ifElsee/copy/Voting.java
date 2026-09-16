package com.logicalStatements.ifElsee.copy;

public class Voting {

	public static void main(String[] args) {
		int age = 18;
		
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}else if(age < 18) {
			System.out.println("You are not eligible to vote");
		}
		else {
			System.out.println("Invalid age");
		}
	}

}
