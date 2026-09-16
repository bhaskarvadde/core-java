package com.fundamentals.constructors;

public class ConstructorChaining {

	int cid;
	int age;
	String name;
	long phone;

	public ConstructorChaining() {
		this(1, "unknown");// Calling two arg constructor
		System.out.println("No arg constructor called ");
	}

	public ConstructorChaining(int cid, int age, String name, long phone) {
		System.out.println("4-arg constructor called ");
		this.cid = cid; 
		this.age = age;
		this.name = name;
		this.phone = phone;
	}

	public ConstructorChaining(int cid, String name) {
		this(cid, 0, name, 0);
		System.out.println("Two arg constructor called ");
 
	}
	
	public static void main(String[] args) {
		System.out.println("main method staretd ");

		ConstructorChaining c1 = new ConstructorChaining(); 
		c1.show(); 

		ConstructorChaining c3 = new ConstructorChaining(102, "Aakash");
		c3.show();
		
		ConstructorChaining c2 = new ConstructorChaining(101, 23, "Bhaskar", 9988776655L);
		c2.show();
 
		System.out.println("main method ended ");

	}

	void show() {
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Age : " + age);
		System.out.println("Name of the customer : " + name);
		System.out.println("Phone of the Customer  " + phone);
		System.out.println("*************************************");
	}

}
