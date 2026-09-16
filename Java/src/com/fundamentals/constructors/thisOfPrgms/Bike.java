package com.fundamentals.constructors.thisOfPrgms;

public class Bike {
	String name;
	String brand;
	int model; 
	
	Bike(){
		System.out.println("No-arg constructor"); //it wont print
	}
	
	Bike(String name,String brand,int model){
		this("Bajaj","Discover");
		this.name = name; 
		this.brand = brand;
		this.model = model;
	}
	 
	Bike(String name,String brand){
		System.out.println("2-org constructor");
		this();
		
	}
	
	Bike(String name){
		System.out.println("1-org constructor");
	}
	

	public static void main(String[] args) {
		Bike obj = new Bike("TVS","Raider",2025);  
		obj.display();
		
		Bike obj2 = new Bike("Yamaha","FZ-S",2021); 
		obj2.display(); 
	}
	
	void display() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(model);
		System.out.println("-----------------------");
	}

}
