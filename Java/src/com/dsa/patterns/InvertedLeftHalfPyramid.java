package com.dsa.patterns;

//3) Inverted Left Half Pyramid -
//
//*****
//****
//***
//**
//*

public class InvertedLeftHalfPyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
