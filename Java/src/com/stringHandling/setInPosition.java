package com.stringHandling;

// am2 i1 going3 home5 to4
public class setInPosition {

	public static void main(String[] args) {
		String str = "am2 i1 going3 home5 to4";

		String[] str1 = str.split(" ");
		String[] res = new String[str1.length];
		
		for (String s : str1) {
			int pos = Character.getNumericValue(s.charAt(s.length() - 1));
			res[pos - 1] = s.substring(0, s.length() - 1);
		}

		for (String s : res) {
			System.out.print(s + " ");
		}

	}

}
