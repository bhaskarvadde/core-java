package com.lab;

public class RestaurantBill {
	String customerName;
	String foodItem;
	double quantity;
	double price;
	
	RestaurantBill(String customerName, String foodItem,double quantity, double price){
		this.customerName  = customerName; 
		this.foodItem = foodItem;
		this.quantity = quantity; 
		this.price = price;
	}
	
	void display() {
		System.out.println(customerName); 
		System.out.println("======================");
		System.out.println(foodItem);
		System.out.println(quantity);
		System.out.println(price); 
		
		System.out.println("Total Bill: " + (quantity*price)); 
		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		RestaurantBill obj1 = new RestaurantBill("Bhaskar","Dosa",1,45);
		obj1.display();  
		
		RestaurantBill obj2 = new RestaurantBill("Abhi","Idli",2,35); 
		obj2.display();
		
		RestaurantBill obj3 = new RestaurantBill("Sathish","Puri",3,40); 
		obj3.display();
	}

}
