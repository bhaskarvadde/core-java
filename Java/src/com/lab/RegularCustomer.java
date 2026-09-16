package com.lab;

public class RegularCustomer implements CustomerInterface {

	@Override
	public void discount(double amount) {
		double discount = (amount * 5) / 100;

		System.out.println("Total after Discount : " + (amount - discount));
	}

}
