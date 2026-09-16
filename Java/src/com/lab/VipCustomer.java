package com.lab;

public class VipCustomer implements CustomerInterface {

	@Override
	public void discount(double amount) {
		double discount = (amount * 25) / 100;

		System.out.println("Total after Discount : " + (amount - discount));
	}

}
