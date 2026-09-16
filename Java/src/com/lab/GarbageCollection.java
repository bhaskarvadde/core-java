package com.lab;

public class GarbageCollection {
	protected void finalize() {
	   System.out.println("Object destroyed");
	}

	
	static void scope() {
		GarbageCollection obj4 = new GarbageCollection();
		System.out.println(obj4);
	}

	public static void main(String[] args) {
		GarbageCollection obj = new GarbageCollection();
		System.out.println(obj);
		// Nullifying Object
		System.out.println("Nullifying Object");
		obj = null;  
		System.out.println(obj);
		
		// Reassigning Object
		System.out.println("Reassigning Object");
		GarbageCollection obj2 = new GarbageCollection();
		GarbageCollection obj3 = new GarbageCollection();
		
		// before reassigning
		System.out.println("before reassigning");
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj2 = obj3;
		// after reassigning
		System.out.println("after reaasigning");
		System.out.println(obj2);
		System.out.println(obj3); 
		
		// Out of Scope
		System.out.println("Out of Scope");
		scope();
		 
		// Anonymous Objects
		System.out.println("Anonymous Objects");
		new GarbageCollection();
		
		System.gc();
	}

}
