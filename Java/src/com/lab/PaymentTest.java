package com.lab;

public class PaymentTest {

	public static void main(String[] args) {
		Payment p = new CreditCard();

		p.pay(500);

		Payment u = new UPI();

		u.pay(1000);

		Payment c = new Cash();

		c.pay(1500);
	}

}
