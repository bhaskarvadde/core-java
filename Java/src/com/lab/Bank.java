// create Bank class
// take fields accno,name,balance
// take display() to print fields
// assign data for fields using object reference
// for every object accno have to increase automatically
 
package com.lab;

public class Bank {
	static long accno;
	String name;
	double balance;
	
	void display(String name , double balance){
		System.out.println("Account No: " + accno);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println("-----------------------");
	} 
	
	{  
		accno++;
	}

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.name = "Bhaskar";
		obj.balance = 34.5;
		 
		obj.display();
		
		Bank obj2 = new Bank();
		obj2.name = "Venu";
		obj2.balance = 5000.5F;
		 
		obj2.display();
		
		Bank obj3 = new Bank();
		obj3.name = "Abhi";
		obj3.balance = 844.5;
		  
		obj3.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

} 
