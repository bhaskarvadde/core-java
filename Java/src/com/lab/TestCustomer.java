package com.lab;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Customer Type Details");
		System.out.println("1 : Regular Customer");
		System.out.println("2 : Premium Customer");
		System.out.println("3 : VIP Customer");

		System.out.println("Enter Customer Type: ");
		int n = sc.nextInt();

		CustomerInterface c = null;

		switch (n) {
		case 1: {
			c = new RegularCustomer();
			c.discount(1000);
			break;
		}
		case 2: {
			c = new RegularCustomer();
			c.discount(1500);
			break;
		}
		case 3: {
			c = new RegularCustomer();
			c.discount(2000);
			break;
		}
		default:
			System.out.println("Invalid Customer");
		}
	}

}
