package com.fundamentals.constructorsSuperOf;

class Phone{
	String brand;
	String model;
	int batteryCapacity; 
	
	Phone(String brand,String model,int batteryCapacity){
		this.brand=brand;
		this.model=model;
		this.batteryCapacity=batteryCapacity;
	}
}

public class SmartPhone extends Phone{
	String os;
	int ramInGB;
	
	SmartPhone(String brand,String model,int batteryCapacity,String os,int ramInGB){
		super(brand,model,batteryCapacity);
		System.out.println("child no arg"); 
		this.os=os;
		this.ramInGB=ramInGB;
	}

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("Poco","x4pro",5000,"Android",6);
		System.out.println(s.brand); 
		System.out.println(s.model); 
		System.out.println(s.batteryCapacity); 
		System.out.println(s.os); 
		System.out.println(s.ramInGB);  
	}

}
