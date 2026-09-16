package com.oops.typesOfInheritance;

//Hierarchical Inheritance
//Definition:
//Hierarchical Inheritance is a type of inheritance in which
//multiple child classes inherit from a single parent class.

//Parent class
class F {

 // Static method
 static void method1() {
     System.out.println("method 1");
 }
}

//First child class
class D extends F {

 // D inherits method1() from F
}

//Second child class
public class HierarchicalInheritance extends F {

 public static void main(String[] args) {

     // Calling the inherited method from parent class F
     method1();

     // You can also call:
     // F.method1();
 }
}



//Visualization
//F
//+---------+
//|method1()|
//+---------+
//▲       ▲
//│       │
//extends  extends
//│       │
//D   HierarchicalInheritance





 