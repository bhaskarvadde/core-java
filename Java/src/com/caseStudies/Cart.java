package com.caseStudies;

import java.util.Scanner;

public class Cart {

	Scanner sc = new Scanner(System.in);

	double price;
	int quantity;
	static int count;

	void addItem() {

		System.out.print("Enter item price: ");
		price = sc.nextDouble();

		System.out.print("Enter item quantity: ");
		quantity = sc.nextInt();

		count++;
	}

	double getTotal() {
		return price * quantity;
	}

	double getDiscount() {
		return ((int)(getTotal() / 1500)) * 300; 
	}

	double getBill() {
		return getTotal() - getDiscount();
	}

	void display() {
		System.out.println("\nPrice: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Items in Cart: " + count);
		System.out.println("Total Amount: ₹" + getTotal());
		System.out.println("Discount: ₹" + getDiscount());
		System.out.println("Final Payable Amount: ₹" + getBill());
		System.out.println("*************************************");
	}

	public static void main(String[] args) {

		Cart c = new Cart()

		c.addItem();
		c.display();

		Cart c1 = new Cart();

		c1.addItem();
		c1.display();
	}
}