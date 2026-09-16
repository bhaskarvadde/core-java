package com.fundamentals.constructorsSuperOf;

class Bank{
	String bankName;
	String ifscCode;
	
	Bank(){
		System.out.println("parent no arg");
		this("SBI","SBIN0001");
	}
	
	Bank(String bankName,String ifscCode){
		this.bankName=bankName;
		this.ifscCode=ifscCode;
		System.out.println("parent 2 org");
	}
}

public class SavingsAccount extends Bank {
	double balance;
	double interestRate;
	
	SavingsAccount(){
		System.out.println("child no arg"); 
		this(2500.0,5.0);
	}
	 
	SavingsAccount(double balance,double interestRate) {
		this.balance=balance;
		this.interestRate=interestRate;
		System.out.println("child 2 org");
	}

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(); 
		System.out.println(s.bankName);
		System.out.println(s.ifscCode); 
		System.out.println(s.balance);
		System.out.println(s.interestRate);
	}

}
