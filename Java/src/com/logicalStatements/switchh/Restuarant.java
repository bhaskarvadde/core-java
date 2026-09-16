package com.logicalStatements.switchh;
import java.util.Scanner;

public class Restuarant {
	static Scanner sc = new Scanner(System.in);
	
	static double totalBill;
	static double pizzaPrize = 250;
	static double burgerPrize = 120;
	static double sandWitchPrize = 100; 
	static double coffeePrice = 80;
	
	static void display() {
		System.out.println("Bee Restuarant");
		System.out.println("******************");
		System.out.println("Pizza : " + pizzaPrize);
		System.out.println("Burger : " + burgerPrize);
		System.out.println("Sandwitch : " + sandWitchPrize);
		System.out.println("Coffee : " + coffeePrice);
	}	

	public static void main(String[] args) {
		display();
		
		System.out.println("Enter Choice");
		int choice = sc.nextInt(); 
		
		double bill = switch(choice) { 
		case 1: {
			System.out.println("Pizza");
			System.out.println("----------");
			System.out.println("Enter quantity: ");
			int qty = sc.nextInt();
			double PBill =  qty*pizzaPrize;
			yield PBill;    
		} 
		case 2: {
			System.out.println("Burger");
			System.out.println("----------");
			System.out.println("Enter quantity: ");
			int qty = sc.nextInt();
			double PBill =  qty*burgerPrize;
			yield PBill;     
		}
		case 3: {
			System.out.println("Sandwitch");
			System.out.println("----------");
			System.out.println("Enter quantity: ");
			int qty = sc.nextInt();
			double PBill =  qty*sandWitchPrize; 
			yield PBill;    
		}
		case 4: {
			System.out.println("Coffee");
			System.out.println("----------");
			System.out.println("Enter quantity: ");
			int qty = sc.nextInt(); 
			double PBill =  qty*coffeePrice;
			yield PBill;    
		}
		default:
			yield -1;
		};
		
		System.out.println("Total Bill: "+bill); 

	}

}
