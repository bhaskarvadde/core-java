package com.logicalStatements.switchh.copy;
import java.util.Scanner;

public class ATMMenu {
	static double balance = 10000;
	
	static Scanner sc =  new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter Option: ");
		int op = sc.nextInt();
		
		switch(op) {
		case 1 -> System.out.println("Available Balance: " + balance);
		
		case 2 -> {
			System.out.println("Enter amount to deposit");
			double depAmount = sc.nextInt();
			balance += depAmount;
			System.out.println("Available Balance: " + balance);
		} 
		case 3 -> {
			System.out.println("Enter amount to Withdraw");
			double depAmount = sc.nextInt();
			balance -= depAmount;
			System.out.println("Available Balance: " + balance);
		}
		default -> System.out.println("Invalid Option Selected");  
		}
		
	}

}
