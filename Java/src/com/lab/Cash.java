package com.lab;

public class Cash implements Payment{
	public void pay(double amount) {
		System.out.println("Cash: " + amount); 
	}
}
