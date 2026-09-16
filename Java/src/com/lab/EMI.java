package com.lab;
import java.util.Scanner;

public class EMI {
	
	static double calculateEMI(double loanAmount,double months) {
		double emiAmount = loanAmount/months;
		
		return emiAmount;
	}
	
	static double calculateInterest(double interestRate, double loanAmount) {
		double interest = (loanAmount*interestRate)/100;  
		 
		return interest;
	}
	
	static double calculateTotalAmount(double loanAmount, double interest) {
		double totalAmount = loanAmount + interest;
		 
		return totalAmount;
	}
	
	static double calculateGST(double totalAmount,double gstPerc) {
		 double gst = totalAmount * gstPerc;
		 
		 return gst;
	}
	  
	static void display(double loanAmount,double calculateEMI,double calculateInterest,double calculateTotalAmount,double calculateGST) {
		System.out.println("EMI Calculation");
		System.out.println("-------------------");
		
		System.out.println("Loan Amount: " + loanAmount); 
		System.out.println("EMI Amount : "+calculateEMI);
		System.out.println("Interest : "+calculateInterest);
		System.out.println("Total Amount : "+calculateTotalAmount);
		System.out.println("GST : "+calculateGST);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Loan Amount: ");
		double loanAmount = sc.nextDouble();
		System.out.println("Enter months: ");
		double months = sc.nextDouble();
		 
		double emi = calculateEMI(loanAmount,months);
		
		System.out.println("Enter Interest Rate: ");
		double interestRate = sc.nextDouble();
		double interest = calculateInterest(interestRate,loanAmount);  
		
		double totalAmount = calculateTotalAmount(loanAmount,interest); 
		
		System.out.println("Enter GST Percentage: ");
		double gstPerc = sc.nextDouble();
		double gst = calculateGST(totalAmount,gstPerc);  
		
		display(loanAmount, emi, interest, totalAmount, gst);  
	}

}
