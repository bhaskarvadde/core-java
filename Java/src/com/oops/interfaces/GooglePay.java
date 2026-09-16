package com.oops.interfaces;

public class GooglePay implements Payment{
	private static double balance = 10000;
	
	@Override
	public void pay(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Paid Rs " + amount + " using GooglePay"); 
		}
		
	} 
	
	@Override
	public void refund(double amount) {
		if(amount <= balance) {
			balance += amount;
			System.out.println("Refunded " + amount + " to GooglePay"); 
		}
		
	}
	  
	@Override
	public void checkBalance() {
		System.out.println("Total Balance: "+ balance);
	}
}
