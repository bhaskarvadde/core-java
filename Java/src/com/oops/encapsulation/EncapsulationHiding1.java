package com.oops.encapsulation;

/*
 * Program: Encapsulation and Data Hiding
 *
 * Encapsulation:
 * --------------
 * Encapsulation is the process of wrapping data (variables) and
 * methods (getters and setters) into a single class.
 *
 * Benefits:
 * 1. Provides Data Hiding.
 * 2. Protects object data from unauthorized access.
 * 3. Allows validation before storing values.
 * 4. Makes code secure and maintainable.
 */
 
public class EncapsulationHiding1 {

	// Private instance variables (Data Hiding)
	// These variables cannot be accessed directly from outside the class.
	private String name;
	private int age;
	private String course;
	private double duration;

	// Setter Method
	// Used to assign/update the value of name.
	public void setName(String name) {
		this.name = name;
	}

	// Getter Method
	// Used to retrieve the value of name.
	public String getName() {
		return name;
	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for course
	public void setCourse(String course) {
		this.course = course;
	}

	// Getter for course
	public String getCourse() {
		return course;
	}

	// Setter for duration
	public void setDuration(double duration) {
		this.duration = duration;
	}

	// Getter for duration
	public double getDuration() {
		return duration;
	}

	public static void main(String[] args) {

		// No execution in this class.
		// Another class (EncapsulationHiding2) creates the object
		// and accesses these methods.
	}
}