package com.oops.typesOfInheritance;

//Single Inheritance
//Definition:
//Single Inheritance is a type of inheritance in which one child class
//inherits the properties (variables) and behaviors (methods)
//of only one parent class using the 'extends' keyword.

//Parent class (Superclass)
class Parent {

 // Static method of the parent class
 static void drive() {
     System.out.println("Drive Car");
 }
}

//Child class (Subclass) inherits Parent class
public class SingleInheritance extends Parent {

 public static void main(String[] args) {

     // Calling the inherited static method.
     // Since SingleInheritance extends Parent,
     // it can directly access the static method of Parent.
     drive();

     // You can also call it like this:
     // Parent.drive();
 }
}


//
//Visualization
//Parent
//+----------------+
//| drive()        |
//+----------------+
//   ▲
//   |
//extends
//   |
//   ▼
//SingleInheritance
//+----------------+
//| main()         |
//+----------------+