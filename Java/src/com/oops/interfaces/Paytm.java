package com.oops.interfaces;

public class Paytm implements Payment {
	private static double balance = 10000;

	@Override
	public void pay(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Paid Rs " + amount + " using Paytm");
		}

	}

	@Override
	public void refund(double amount) {
		if (amount <= balance) {
			balance += amount;
			System.out.println("Refunded " + amount + " to Paytm");
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("Total Balance: " + balance);
	}
}