package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection3 {

	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<>();

		c1.add(101);
		c1.add(102);

		// ArrayList hashCode calculation:
		// Initial hash = 1
		// After adding 101:
		// hash = 31 * 1 + 101 = 132
		//
		// After adding 102:
		// hash = 31 * 132 + 102 = 4194

		System.out.println(c1);
		System.out.println(c1.hashCode());

		Collection<Integer> c2 = new ArrayList<>();

		c2.add(102);
		c2.add(101);

		// Here the order is different.
		//
		// Initial hash = 1
		// After adding 102:
		// hash = 31 * 1 + 102 = 133
		//
		// After adding 101:
		// hash = 31 * 133 + 101 = 4224

		System.out.println(c2);
		System.out.println(c2.hashCode());

		// false because ArrayList/List considers the ORDER of elements.
		// c1 = [101, 102]
		// c2 = [102, 101]
		//
		// Same elements but different order => not equal.

		System.out.println(c1.equals(c2));
		
		
	}
}
