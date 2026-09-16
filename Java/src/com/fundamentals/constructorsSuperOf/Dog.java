package com.fundamentals.constructorsSuperOf;

class Animal {
	String name;
	String sound;
	int age;

	Animal(String name, String sound, int age) {
		this.name=name;
		this.sound=sound;
		this.age=age;
	}
}

public class Dog extends Animal{
	String breed; 
	boolean isVaccinated;
	
	public Dog(String name,String sound,int age,String breed,boolean isVaccinated){
		super(name,sound,age);  
		this.breed=breed;
		this.isVaccinated=isVaccinated; 
	}

	public static void main(String[] args) {
		Dog d = new Dog("Rocky","bow",2,"German Shepard",true);
		System.out.println(d.name);
		System.out.println(d.sound);
		System.out.println(d.age);
		System.out.println(d.breed);
		System.out.println(d.isVaccinated); 
	}

}
