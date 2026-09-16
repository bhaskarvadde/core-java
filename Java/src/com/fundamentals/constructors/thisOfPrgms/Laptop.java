package com.fundamentals.constructors.thisOfPrgms;

public class Laptop {
	String brand;
	String model;
	int series;
	
	Laptop(String brand,String model,int series){
		this.brand=brand;
		this.model=model;
		this.series=series;
		this("p");
		
	}
	
	Laptop(String brand,String model){
		this(brand,model,0);
	
	}
	 
	Laptop(String brand){
		this.brand=brand;
		System.out.println("1-org constructor");
		
	}

	public static void main(String[] args) {
		Laptop obj = new Laptop("Asus","Vivobook",16);
		obj.display();
		
		Laptop obj1 = new Laptop("Lenovo","Thinkpad",15);
		obj1.display();
		
		Laptop obj2 = new Laptop("Hp","Pavilion",12);
		obj2.display();
	}
	 
	void display() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(series);
		System.out.println("-----------------------");
	}

}
