package com.oops.typesOfInheritance;

//Hybrid Inheritance
//Definition:
//Hybrid Inheritance is a combination of two or more types of inheritance,
//such as Hierarchical + Multiple Inheritance.
//
//Java does NOT support Hybrid Inheritance with classes because
//multiple inheritance of classes is not allowed.
//However, it can be achieved using interfaces.

//Parent Interface 1
interface Father {

 void fatherProperty();
}

//Parent Interface 2
interface Mother {

 void motherProperty();
}

//Child class implements both interfaces
//(Multiple Inheritance using interfaces)
class Child implements Father, Mother {

 @Override
 public void fatherProperty() {
     System.out.println("Father's Property");
 }

 @Override
 public void motherProperty() {
     System.out.println("Mother's Property");
 }
}

//Another child inherits Child class
//(Multilevel + Multiple = Hybrid Inheritance)
public class HybridInheritance extends Child {

 public static void main(String[] args) {

     HybridInheritance obj = new HybridInheritance();

     obj.fatherProperty();
     obj.motherProperty();
 }
}


//Visualization
//Father (Interface)
//     \
//      \
//       Child
//      /
//     /
//Mother (Interface)
//     │
//     │ extends
//     ▼
//HybridInheritance
//
//This combines:
//
//Multiple Inheritance (through interfaces)
//Multilevel Inheritance (HybridInheritance extends Child)
//
//Hence, it is called Hybrid Inheritance.

