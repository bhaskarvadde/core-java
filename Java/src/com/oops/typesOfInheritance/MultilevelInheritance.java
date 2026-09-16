package com.oops.typesOfInheritance;

//Multilevel Inheritance
//Definition:
//Multilevel Inheritance is a type of inheritance in which one class
//inherits from another class, and then another class inherits from it.
//This creates a chain of inheritance.

//Parent class (Level 1)
class A {

 // Static method
 static void method1() {
     System.out.println("method 1");
 }
}

//Child class of A (Level 2)
class B extends A {

 // B inherits method1() from A
}

//Child class of B (Level 3)
class C extends B {

 // C inherits method1() through B
}

//Child class of C (Level 4)
public class MultilevelInheritance extends C {

 public static void main(String[] args) {

     // Calling the inherited method.
     // The method belongs to class A,
     // but it is accessible here because of the inheritance chain.
     method1();

     // You can also call:
     // A.method1();
 }
}


//Visualization
//A
//│
//│ extends
//▼
//B
//│
//│ extends
//▼
//C
//│
//│ extends
//▼
//MultilevelInheritance
//Inheritance Chain
//A → B → C → MultilevelInheritance


