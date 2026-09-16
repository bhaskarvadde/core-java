package com.stringHandling;

public class TestStringBuff1 {

	public static void main(String[] args) {
		
//		String s1 = new String(); empty string "" 
		String s1 = new String("Boss"); 
		System.out.println(s1); // Boss
		
//		Strings are immutable
		String s2 = "Java";
		s2.concat("Boss");
		System.out.println(s2);//Java
		
//		StringBuffer and StringBuilder are Mutable(can change value with one object)
		
//		StringBuffer sb = new StringBuffer(); empty line
//		StringBuffer sb1 = "Boss"; Type mismatch: cannot convert from String to StringBuffer
		StringBuffer sb = new StringBuffer("Mersedese");

		System.out.println(sb); 
		sb.append("Benz");
		System.out.println(sb); 
		
		StringBuilder sb1 = new StringBuilder("Bhaskar");
		sb1.append("V");
		System.out.println(sb1);
	}

}
