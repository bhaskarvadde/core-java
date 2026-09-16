package com.logicalStatements.ifElsee.copy;

import java.util.Scanner;

public class JobPortal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Boss Jobs");
		System.out.println("---------------------");
		
		System.out.println("Already Registered?");
		boolean isRegistered = sc.nextBoolean();
		sc.nextLine();
		
		if(isRegistered) {
			System.out.println("Login");
			System.out.println("************");
			System.out.println("Enter your Full Name: ");
			String fullName = sc.nextLine();
			
			System.out.println("Full Name: " + fullName); 
			
			System.out.println("Enter your Password: ");
			String password = sc.nextLine(); 
			
			if(!password.isEmpty()) { 
				System.out.println("Welcome To Boss Jobs!!!");
			}else { 
				System.out.println("Incorrect Password");
			}
		}
		
		else {
			System.out.println("Register Here");
			System.out.println("****************");
			System.out.println("Create your Profile");
			System.out.println("------------------");
			
			System.out.println("Enter your Full Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter your email:");
			String mail = sc.next();
			
			System.out.println("Enter Password: ");
			String password = sc.nextLine();
			
			System.out.println("Enter your current address:");
			String address = sc.nextLine();
			
			System.out.println("Enter Skill 1:");
			String skill1 = sc.nextLine();
			
			System.out.println("Enter Skill 2:");
			String skill2 = sc.nextLine();
			
			System.out.println("Enter Skill 3:");
			String skill3 = sc.nextLine(); 
			
			System.out.println("Enter your Highest Qualification: ");
			String qualification = sc.nextLine();
			
			System.out.println("Are you a Fresher?");
			boolean isFresher = sc.nextBoolean();
			 
			System.out.println("isFresher: " + isFresher); 
			 
			System.out.println("Full Name: " + name); 
			
			System.out.println("mail: " + mail); 
			
			System.out.println("password: " + password); 
			
			System.out.println("address: " + address); 
			
			System.out.println("skill1: " + skill1); 
			
			System.out.println("skill2: " + skill2); 
			
			System.out.println("skill3: " + skill3); 
			
			System.out.println("qualification: " + qualification); 
		}
	}
}
















