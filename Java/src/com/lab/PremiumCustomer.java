package com.lab;

public class PremiumCustomer implements CustomerInterface {

	@Override
	public void discount(double amount) {
		double discount = (amount * 15) / 100;
		System.out.println("Total after Discount : " + (amount - discount));
	}

}
