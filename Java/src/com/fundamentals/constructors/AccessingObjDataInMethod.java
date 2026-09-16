package com.fundamentals.constructors;

public class AccessingObjDataInMethod {

	String name;
	int age; 
	
	void display() {
		System.out.println(name);
		System.out.println(age); 
	}
 
	public static void main(String[] args) {
		AccessingObjDataInMethod obj1 = new AccessingObjDataInMethod();
		obj1.name = "Bhaskar"; 
		obj1.age = 23; 
		obj1.display();
		
		AccessingObjDataInMethod obj2 = new AccessingObjDataInMethod();
		obj2.name = "Pooja"; 
		obj2.age = 17; 
		obj2.display();
		
		AccessingObjDataInMethod obj3 = new AccessingObjDataInMethod();
		obj3.name = "Boss"; 
		obj3.age = 25;  
		
		obj3.display(); 
	}

}
