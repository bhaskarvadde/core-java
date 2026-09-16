package com.dsa.patterns;

//5) Inverted Right Half Pyramid
//
//*****
// ****
//  ***
//   **
//    *

public class InvertedRightHalfPyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			
			for(int k=5;k>=1;k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
