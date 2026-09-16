package com.oops.encapsulation;

/*
 * Driver Class
 *
 * This class demonstrates:
 * 1. Creating objects
 * 2. Calling constructors
 * 3. Using setter methods
 * 4. Printing objects
 * 5. Automatic invocation of toString()
 */

public class FullyEncapsulation2 {

	public static void main(String[] args) {

		// ==================================================
		// Object 1
		// ==================================================

		/*
		 * Calls No-Argument Constructor.
		 */

		FullyEncapsulation1 e1 = new FullyEncapsulation1();

		/*
		 * Values are assigned later using Setter Methods.
		 */

		e1.setEname("Harika");
		e1.setRole("Network Engineer"); 
		e1.setSalary(-10000.00);

		// ==================================================
		// Object 2
		// ==================================================

		/*
		 * Calls Parameterized Constructor.
		 *
		 * Values are assigned during object creation.
		 */

		FullyEncapsulation1 e2 =
				new FullyEncapsulation1(
						"Likitha",
						"Cloud Engineer",
						100000.0);
		
//		e2.setEname("Pallavi"); 

		// ==================================================
		// Printing Objects
		// ==================================================

		/*
		 * We are NOT calling toString() directly.
		 */

		System.out.println(e1);

		/*
		 * Java internally converts this into:
		 *
		 * System.out.println(e1.toString());
		 *
		 * Since we have overridden toString(),
		 * meaningful information is printed.
		 */

		System.out.println(e2);

		/*
		 * Java internally executes:
		 *
		 * System.out.println(e2.toString());
		 *
		 * Same method.
		 * Different object data.
		 */

		// ==================================================
		// Getter Methods
		// ==================================================

		/*
		 * Instead of printing the whole object,
		 * individual values can also be accessed.
		 */

		 System.out.println(e1.getEname());
		 System.out.println(e1.getRole());
		 System.out.println(e1.getSalary());

		/*
		 * Difference:
		 *
		 * getEname() -> returns only employee name.
		 *
		 * toString() -> returns complete object information.
		 */
	}
}
