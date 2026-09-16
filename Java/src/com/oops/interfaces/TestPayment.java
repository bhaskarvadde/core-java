package com.oops.interfaces;

public class TestPayment {

	public static void main(String[] args) {
		System.out.println("*******PhonePe Info*******");
		Payment p = new PhonePe();

		p.pay(500);
		p.refund(1000);
		p.checkBalance();

		System.out.println("\n*******GooglePay Info*******");
		Payment g = new GooglePay();

		g.pay(456);
		g.refund(32);
		g.checkBalance();

		System.out.println("\n*******Paytm Info*******");
		Payment pt = new Paytm();

		pt.pay(698);
		pt.refund(243);
		pt.checkBalance();
	}

}
