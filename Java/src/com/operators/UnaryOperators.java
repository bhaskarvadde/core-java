package com.operators;

//3) Unary Operators --> + - ++ -- 
public class UnaryOperators {
 
	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 5;
		int b = 6;

		System.out.println(-a);
		System.out.println(+b);
		System.out.println("**********Post Increment**********");
		System.out.println(a++);// 5 --> a++ = a= a+1 --> a= 6
		System.out.println(a++);// 6 --> a++ = a= a+1 ==> a=7

		System.out.println("**Pre Decrement **********");
		System.out.println(--a);// --> --a = a = a-1 ==> 6
		System.out.println(--b);// --> --b = b = b-1 ==> 5

		System.out.println("***************Pre Increment ");
		System.out.println(++a);// --> a = a+ 1 ==> 7

		System.out.println("Post Decrement ************* ");
		System.out.println(a--);// 7 --> a = a-1 = 6
		System.out.println(b--);// 5 --> b = b-1 = 4

		System.out.println("A value is : " + a);// 6
		System.out.println("A value is : " + b);// 4

	}

}
