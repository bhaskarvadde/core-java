package com.fundamentals.constructors.thisOfPrgms;

public class Mobile {
	String brand;
	String model;
	String series;
	
	Mobile(String brand,String model,String series){
		this.brand=brand;
		this.model=model;
		this.series=series;
	}
	
	Mobile(String brand,String model){
		this.brand=brand;
		this.model=model;
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile("Xiaomi","Poco","f1");
		obj.display();
		
		Mobile obj1 = new Mobile("Google","Pixel");
		obj1.display();
	}
	
	void display() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(series);
		System.out.println("-----------------------");
	}

}
