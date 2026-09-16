// Calling objects without calling in main method
package com.lab;

public class ObjectCalling {
	void method1() {
		System.out.println("Method 1 called");
	}
	
	void method2() {
		System.out.println("Method 2 called");
		ObjectCalling obj2 = new ObjectCalling();
		obj2.method1();
	}
	 
	static  void method3() {
		System.out.println("static method called");
		ObjectCalling obj1 = new ObjectCalling();
		obj1.method2();
	}
	
	static{
		method3();
	}

	public static void main(String[] args) {
	}
}
 