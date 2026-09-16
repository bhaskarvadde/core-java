package com.operators;

//=  +=   -=   *=  /=  %=  : Assignment Operators 

public class AssignmentOperators {

	public static void main(String[] args) {

		int x = 10;
		int result = 0;

		result = result + x;
		System.out.println(result);// 10

//		result = result + 4.5; //CE :Type mismatch: cannot convert from double to int
		result += 4.5;// --> result = result + 4.5; Narrowing
		System.out.println(result);// 14

//		result = result - 5.5;//CE : Type mismatch: cannot convert from double to int
//		result = (int) (result - 5.5); //14- 5.5 --> 8.5 
		result -= 5.5;
		System.out.println(result);// 8
//		
//		result = result * 4.5;//Type mismatch: cannot convert from double to int
//		result = (int) (result * 4.5);//
		result *= 4.5;
		System.out.println(result);// 36

//		result = result /2.5;//Type mismatch: cannot convert from double to int
//		result = (int) (result /2.5);//
		result /= 2.5;
		System.out.println(result);// 14

//		result = result % 2.5;//Type mismatch: cannot convert from double to int
//		result = (int) (result % 2.5);

		result %= 2.5;
		System.out.println(result);//

//		

	}


}
