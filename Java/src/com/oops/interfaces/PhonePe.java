package com.oops.interfaces;

public class PhonePe implements Payment {
	private static double balance = 10000;

	@Override
	public void pay(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Paid Rs " + amount + " using PhonePe");
		}
	}

	@Override
	public void refund(double amount) {
		if(amount <= balance) {
			balance += amount;
			System.out.println("Refunded " + amount + " to PhonePe");
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Total Balance: " + balance);
	}
}
