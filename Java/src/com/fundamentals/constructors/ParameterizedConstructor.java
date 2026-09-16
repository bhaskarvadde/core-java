package com.fundamentals.constructors;

public class ParameterizedConstructor {
	String name;
	int age; 
 
	ParameterizedConstructor() {

		System.out.println(name);
		System.out.println(age);
	} 

	ParameterizedConstructor(String ename, int eage) {
		name = ename;
		age = eage;
		System.out.println(ename);
		System.out.println(eage);
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor();

		ParameterizedConstructor obj2 = new ParameterizedConstructor("Boss", 23);
	}

}
