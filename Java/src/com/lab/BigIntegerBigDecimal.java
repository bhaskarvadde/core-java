package com.lab;

import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerBigDecimal {

	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("454554545");
		BigInteger b2 = new BigInteger("787815485");
		
		System.out.println("BigInteger Operations");
		System.out.println("--------------------------");
		System.out.println("Addition: " + b1.add(b2));
		System.out.println("Subtraction: " + b1.subtract(b2));
		System.out.println("Multiplication: " + b1.multiply(b2));
		System.out.println("Division: " + b1.divide(b2));
		System.out.println("Modulus: " + b1.mod(b2)); 
		
		BigDecimal d1 = new BigDecimal(454554545.445454545);
		BigDecimal d2 = new BigDecimal(787815485.97979999978798797979);
		@SuppressWarnings("deprecation")
		BigDecimal res= d2.divide(d1, 3, BigDecimal.ROUND_HALF_UP);
		
		System.out.println();
		
		System.out.println("BigDecimal Operations");
		System.out.println("--------------------------");
		System.out.println("Addition: " + d1.add(d2));
		System.out.println("Subtraction: " + d1.subtract(d2));
		System.out.println("Multiplication: " + d1.multiply(d2));
		System.out.println("Division: " + res);
	}

}
 