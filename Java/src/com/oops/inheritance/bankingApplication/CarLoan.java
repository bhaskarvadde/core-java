package com.oops.inheritance.bankingApplication;

import java.util.Scanner;

public class CarLoan extends Loan{ 
	static Scanner sc = new Scanner(System.in); 
 
	void getPersonalLoanDocmentInfo() {
		System.out.println("All Personal Loan documents have been Verified  ");
	}

	public static void main(String[] args) {
		System.out.println("                                                   Boss Banking");
		System.out.println("                                                ******************");

		System.out.println("Car Loan");
		System.out.println("-------------------");

		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getCustomerSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getCustomerAge();

		System.out.println("Enter Aadhar Details : ");
		String aadhar = sc.next();

		System.out.println("Enter PAN number ");
		String pan = sc.next();

		System.out.println("Enter Phone number: ");
		String phone = sc.next();

		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900) && age >= 25 && pl.validateAadhaar(aadhar)
				&& pl.validatePAN(pan) && pl.validatePhone(phone)) {
			System.out.println("Congratulations !!!! ");
			System.out.println("You are Eligible for Car Loan !");
			System.out.println("Your Loan ROI is  :" + pl.roiInfo());
			System.out.println("Enter Address Details ");
			String address = pl.getAddressInfo();

			System.out.println("Customer Address is : " + address);
			pl.getPersonalLoanDocmentInfo();

		} else {
			System.out.println("You are not Eligible for Car Loan Try after sometime !");
		}
	}
}
