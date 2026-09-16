package com.fundamentals.constructorsSuperOf;

public class Vehicle {
	Vehicle(){
		System.out.println("Vehicle no arg constructor");
	}
	
	Vehicle(String brand,int model){
		System.out.println("Vehicle 2-arg constructor"); 
	} 
		
	public static void main(String[] args) {
		
	}

}

class Car extends Vehicle{ 
	String brand;
	int model;
	
	Car(){
		System.out.println("Car No arg constructor");
	}
	
	Car(String brand,int model){
		System.out.println("Car 2-arg constructor");
		this.brand=brand;
		this.model=model;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Car c = new Car();
		System.out.println(c.brand);
		System.out.println(c.model); 
		
		Car c1 = new Car("Bentley",2020);
		System.out.println(c1.brand);
		System.out.println(c1.model); 
	}
}