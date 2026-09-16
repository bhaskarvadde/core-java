package com.fundamentals.constructors.thisOfPrgms;

public class Car {
	String company;
	int model;
	boolean isPetrol; 
	
	Car(){
		System.out.println("No-arg constructor");
		this("Mercedese",2025,false);
	}
	
	Car(String company,int model,boolean isPetrol){
		this("BMW",2020);
		System.out.println("3-arg constructor");
//		this.company=company;
//		this.model=model;
//		this.isPetrol=isPetrol;
	}
	
	Car(String company,int model){ 
		System.out.println("2-arg constructor");
		this.company=company;
		this.model=model;
	}

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.display();
		
		
	}
	
	void display() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(isPetrol); 
		System.out.println("--------------------");
	}

}
