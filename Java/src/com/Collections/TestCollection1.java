package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {

	public static void main(String[] args) {
//		Object[] objs = new Object[5];
//
//		objs[0] = 10;
//		objs[1] = "Boss";
//
//		for (Object obj : objs) {
//			System.out.println(obj);
//		}

//		Cannot instantiate the type Collection
//		Collection c = new Collection(); 

//		ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		Collection c1 = new ArrayList();

//		method - add() 
		c1.add(100);
		c1.add("Hello");

		System.out.println(c1);

//		so we have to use like this
		Collection<Integer> c2 = new ArrayList<>(); 

		c2.add(100);
		c2.add(200); 

		System.out.println(c2); 
		
		Collection<String> c3 = new ArrayList<>(); 

		c3.add("Bhaskar");
		c3.add("Vadde"); 
 
		System.out.println(c3); 
	}

}
