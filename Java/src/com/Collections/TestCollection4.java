package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection4 {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();

		if (!fruits.isEmpty()) {
			fruits.add("Muskmelon");
			fruits.add("Watermelon");
			fruits.add("Sapota");
		} else {
			fruits.add("Banana");
			fruits.add("Apple");
			fruits.add("Orange");
		}

		System.out.println(fruits);

//		Accessing elements types
//		Scenario 1 - for each loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("-------------------");

//		Scenario 2 - using iterator
		Iterator<String> itr = fruits.iterator();

		while (itr.hasNext()) {
			String fruit = itr.next();

			System.out.println(fruit);

			if (fruit.equals("Banana")) {
				itr.remove();

			}

		}
		
		System.out.println(fruits);

	}

}
