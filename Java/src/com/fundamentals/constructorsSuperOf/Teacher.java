package com.fundamentals.constructorsSuperOf;

class School{
	String schoolName;
	String address; 
	int pinCode;
	
	School(String schoolName,String address,int pinCode){
		this.schoolName= schoolName; 
		this.address = address;
		this.pinCode = pinCode; 
	}
}

public class Teacher extends School{
	
	Teacher(String schoolName,String address,int pincode){
		super(schoolName,address,pincode);  
	}
 
	public static void main(String[] args) {
		Teacher t = new Teacher("abc","hyd",500070);
		
		System.out.println(t.schoolName);
		System.out.println(t.address);
		System.out.println(t.pinCode);
	}
 
}
