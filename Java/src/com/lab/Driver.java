package com.lab;

public class Driver {

	public static void main(String[] args) {
		Address a = new Address("Hyd", "TS");

		Studentt s = new Studentt(10, "Boss", a);

		System.out.println(a.city);
		System.out.println(a.state);
		System.out.println(s.name);
		System.out.println(s.rollNo);
		
		a.city = "Banglore";
		a.state = "KS";
		
		System.out.println(a.city);
		System.out.println(a.state);
	}

}
