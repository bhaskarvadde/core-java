package com.stringHandling;

public class TestString14 {

	public static void main(String[] args) {
		String phone = "7993393695";

		// matches()
		System.out.println(phone.matches("[6-9][0-9]{9}"));

		String adhar = "223456781234";
		System.out.println(adhar.matches("[2-9][0-9]{11}"));

		String pan = "FNAPB6652G";
		System.out.println(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"));

//		length()
		String str = "Bhaskar Vadde";
		System.out.println(str.length());
	}

}
