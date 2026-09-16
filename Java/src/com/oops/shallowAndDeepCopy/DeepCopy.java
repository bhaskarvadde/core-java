package com.oops.shallowAndDeepCopy;

//==============================================================
//DEEP COPY DEMO
//==============================================================
//GOAL: Fix the shallow copy problem by making sure that EVERY
//nested mutable object gets its own brand-new copy, instead of
//sharing a reference with the original.
//This version does NOT use Cloneable/clone() at all — instead
//it uses a COPY CONSTRUCTOR, a very common real-world approach.
//==============================================================

class Employee {
	int eid;
	String name;
	Department department; // reference field -> needs deep copying

	// Normal constructor -> used to build the very first Employee object
	public Employee(int eid, String name, Department department) {
		this.eid = eid;
		this.name = name;
		this.department = department;
	}

	// COPY CONSTRUCTOR -> takes an existing Employee and builds
	// a brand-new, fully independent Employee from it.
	public Employee(Employee emp) {

		this.eid = emp.eid; // primitive -> copied by value, always independent
		this.name = emp.name; // String -> immutable, safe even if "shared"

		// THE KEY LINE FOR DEEP COPY:
		// Instead of doing "this.department = emp.department;" (which would
		// be a shallow copy and share the same Department object),
		// we create a BRAND NEW Department object using ITS OWN copy
		// constructor. Now emp2.department and emp1.department point to
		// two completely separate objects in memory.
		this.department = new Department(emp.department);
	}
}

class Department {

	String name;

	// Normal constructor -> builds the first Department object
	public Department(String name) {
		this.name = name;
	}

	// Copy constructor for Department -> creates a new Department object
	// with the same 'name' value as the one passed in. This is what makes
	// the deep copy chain complete: Employee's copy constructor calls
	// Department's copy constructor.
	Department(Department department) {
		this.name = department.name;
	}
}

public class DeepCopy {

	public static void main(String[] args) {

		// Step 1: Create a Department object and an Employee that uses it
		Department d = new Department("Java");
		Employee emp1 = new Employee(1, "Srikanth", d);

		System.out.println(emp1.eid); // 1
		System.out.println(emp1.name); // Srikanth
		System.out.println(emp1.department.name); // Java

		System.out.println("-------------------------");

		// Step 2: Deep copy emp1 into emp2 using the copy constructor.
		// Internally this also creates a NEW Department object
		// (see Employee's copy constructor above).
		Employee emp2 = new Employee(emp1);

		System.out.println(emp2.eid); // 1
		System.out.println(emp2.name); // Srikanth
		System.out.println(emp2.department.name); // Java

		System.out.println("*************************");

		// Step 3: Mutate emp2's fields
		emp2.eid = 9;
		// Primitive -> only affects emp2, always was independent anyway.

		emp2.department.name = "JFS";
		// Because emp2.department is a SEPARATE Department object
		// (not shared with emp1.department), this change stays
		// isolated to emp2 only. emp1.department.name is untouched.

		System.out.println("*************************");
		System.out.println(emp2.eid); // 9
		System.out.println(emp2.name); // Srikanth
		System.out.println(emp2.department.name); // JFS

		System.out.println("-------------------------");

		// Step 4: Check emp1 again -> proof of deep copy
		System.out.println(emp1.eid); // 1 (unaffected)
		System.out.println(emp1.name); // Srikanth (unaffected)
		System.out.println(emp1.department.name); // Java (unaffected!! - this is deep copy working)

		// TAKEAWAY:
		// Unlike the shallow copy demo, emp1.department.name stayed
		// "Java" even after we changed emp2.department.name to "JFS".
		// That's because emp1 and emp2 each own their OWN independent
		// Department object — nothing is shared between them.
	}
}
