package com.oops.encapsulation;

import java.util.Scanner;

public class Bank1 {

	private static long nextAccNo = 354789100;

	private long accNo;
	private String name;
	private double balance;

	Scanner sc = new Scanner(System.in);

	{
		accNo = nextAccNo++;
	}

	// Constructor
	public Bank1(String name, double balance) {

		if (name != null && !name.trim().isEmpty()) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}

		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}

//		this.accNo = nextAccNo++;
	}

	// Deposit
	public void deposit() {

		System.out.print("Enter amount to deposit : ");
		double amount = sc.nextDouble();

		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposited successfully.");
		} else {
			System.out.println("Invalid amount.");
		}
	}

	// Withdraw
	public void withdraw() {

		System.out.print("Enter amount to withdraw : ");
		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid amount.");
		} else if (amount > balance) {
			System.out.println("Insufficient Balance.");
		} else {
			balance -= amount;
			System.out.println("Amount withdrawn successfully.");
		}
	}

	// Getters

	public long getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// Setter only for name

	public void setName(String name) {

		if (name != null && !name.trim().isEmpty()) {
			this.name = name; 
		} else {
			System.out.println("Invalid Name");
		}
	}

	@Override
	public String toString() {
		return "Account Number : " + accNo + "\nName          : " + name + "\nBalance       : " + balance;
	}
}
