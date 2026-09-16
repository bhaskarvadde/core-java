// Counting no of Objects

package com.lab;

public class CountofObjects {
	static int count = 0;
	
	{
		count++;
	}

	public static void main(String[] args) {
		CountofObjects obj1 = new CountofObjects();
		CountofObjects obj2 = new CountofObjects();
		CountofObjects obj3 = new CountofObjects();
		
		System.out.println(count);
	} 
 
}
