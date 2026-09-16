package com.oops.encapsulation;

/*
 * Driver Class
 *
 * This class demonstrates how to access private variables
 * using public getter and setter methods.
 */

public class EncapsulationHiding2 {

	public static void main(String[] args) {

		// Creating an object of EncapsulationHiding1 class
		EncapsulationHiding1 obj = new EncapsulationHiding1();

		/*
		 * Setting values using Setter Methods
		 * Direct access like obj.name is not allowed
		 * because the variables are private.
		 */
		obj.setName("Bhaskar");
		obj.setAge(25);
		obj.setCourse("Java");
		obj.setDuration(7.5);
 
		/*
		 * Retrieving values using Getter Methods
		 */
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getCourse());
		System.out.println(obj.getDuration());
	}
}
