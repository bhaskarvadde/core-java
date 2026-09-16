package com.lab;

public class CreditCard implements Payment{
	
	public void pay(double amount) {
		System.out.println("CreditCard Balance: " + amount); 
	}
}
