package com.oops.typesOfInheritance;

//Multiple Inheritance
//Definition:
//A single class inherits the features of more than one parent.
//Java supports multiple inheritance only through interfaces.

//Parent Interface 1
interface FatherInterface {

 void fatherProperty();
}

//Parent Interface 2
interface MotherInterface {

 void motherProperty();
}

//Child class implements both interfaces
public class MultipleInheritance implements FatherInterface, MotherInterface {

 @Override
 public void fatherProperty() {
     System.out.println("Father's Property");
 }

 @Override
 public void motherProperty() {
     System.out.println("Mother's Property");
 }

 public static void main(String[] args) {

     MultipleInheritance obj = new MultipleInheritance();

     obj.fatherProperty();
     obj.motherProperty();
 }
}
//Visualization
//Father (Interface)
//      \
//       \
//        ▼
//MultipleInheritance
//        ▲
//       /
//      /
//Mother (Interface)
//
//The MultipleInheritance class inherits the behavior of both Father and Mother by implementing 
//both interfaces.
//
//Why Doesn't Java Support Multiple Inheritance with Classes?
//
//Consider this example:
//
//class A {
//void show() {
//  System.out.println("Class A");
//}
//}
//
//class B {
//void show() {
//  System.out.println("Class B");
//}
//
////❌ Not Allowed
//class C extends A, B {
//
//}
//
//If C inherited from both A and B and you called:
//
//C obj = new C();
//obj.show();
//
//Java would not know whether to execute A.show() or B.show(). This ambiguity is called the Diamond 
//Problem.
//
//To avoid this confusion, Java does not allow a class to extend more than one class.
//
//Real-Life Example
//  Father
//     \
//      \
//       Child
//      /
//     /
// Mother
//
//A child inherits characteristics from both parents. In Java, this relationship is represented 
//using interfaces, not multiple parent classes.
