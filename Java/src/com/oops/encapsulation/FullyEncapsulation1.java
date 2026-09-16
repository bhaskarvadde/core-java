package com.oops.encapsulation;

/*
 * Program: Fully Encapsulation
 *
 * Encapsulation:
 * --------------
 * Encapsulation is the process of wrapping data (variables) and
 * methods (constructors, getters, setters, toString(), etc.)
 * into a single class.
 *
 * This class demonstrates:
 * 1. Private instance variables (Data Hiding)
 * 2. Constructors
 * 3. Getter methods
 * 4. Setter methods
 * 5. Method Overriding (toString())
 *
 * Note:
 * -----
 * This class is encapsulated because the data is private and
 * accessible only through public methods.
 *
 * A stronger real-world example of encapsulation would also
 * validate data inside setter methods.
 */

public class FullyEncapsulation1 {

	// ===========================
	// Private Instance Variables
	// ===========================

	// Data Hiding:
	// These variables cannot be accessed directly outside the class.
	private String ename;
	private String role;
	private double salary;

	// ===========================
	// Constructors
	// ===========================

	// No-Argument Constructor
	public FullyEncapsulation1() {
		System.out.println("No Argument Constructor Called");
	}

	// Parameterized Constructor
	public FullyEncapsulation1(String ename, String role, double salary) {

		/*
		 * Java automatically inserts super() here.
		 *
		 * Since every class extends Object class, Object's constructor is called first.
		 *
		 * Therefore writing super() here is optional.
		 */

//		this.ename = ename;
//		this.role = role;
//		this.salary = salary;
		
		setEname(ename);
		setRole(role);
		setSalary(salary);// it works for both no org and org objects
	}

	// ===========================
	// Getter Methods
	// ===========================

	// Returns employee name
	public String getEname() {
		return ename;
	}

	// Returns employee role
	public String getRole() {
		return role;
	}

	// Returns employee salary
	public double getSalary() {

		return salary;
	}

	// ===========================
	// Setter Methods
	// ===========================

	// Assigns employee name
	public void setEname(String ename) {
		if (ename != null && !ename.trim().isEmpty()) {
			this.ename = ename;
		} else {
			System.out.println("Invalid Employee Name");
		}
	}

	// Assigns employee role
	public void setRole(String role) {
		if (role != null && !role.trim().isEmpty()) {
			this.role = role;
		} else {
			System.out.println("Invalid Employee Name");
		}
	}
 
	// Assigns employee salary
	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid Salary");
		}
	}

	// ===========================
	// Overriding toString()
	// ===========================

	/*
	 * toString() is inherited from Object class.
	 *
	 * By default it prints: ClassName@HexadecimalHashCode
	 *
	 * Example: FullyEncapsulation1@2f92e0f4
	 *
	 * We override it to print meaningful object information.
	 */

	@Override
	public String toString() {

		/*
		 * @Override
		 *
		 * Not compulsory but highly recommended.
		 *
		 * It tells the compiler that this method is overriding Object class's
		 * toString().
		 *
		 * If you accidentally write:
		 *
		 * public String tostring()
		 *
		 * instead of
		 *
		 * public String toString()
		 *
		 * the compiler immediately reports an error.
		 *
		 * Without @Override, Java treats it as a completely new method.
		 */

		return "FullyEncapsulation1 [ename=" + ename + ", role=" + role + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

	}
}