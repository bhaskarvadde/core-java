package com.lab;

public class UPI implements Payment{
	public void pay(double amount) {
		System.out.println("UPI Balance: " + amount); 
	}
}
