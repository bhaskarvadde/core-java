package com.lab;

public class Car {
	
	static void display(String name, String color, String brand, String model) {
		System.out.println("Car Name: "+ name);
		System.out.println("Car Color: "+ color);
		System.out.println("Car Brand: "+ brand);
		System.out.println("Car Model: "+ model);
	} 

	public static void main(String[] args) {
		 
		display("Mersedese Benz","Red","G-Wagon","G63");
	}

}
