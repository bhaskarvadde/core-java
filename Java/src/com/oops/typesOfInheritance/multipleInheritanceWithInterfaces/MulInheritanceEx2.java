package com.oops.typesOfInheritance.multipleInheritanceWithInterfaces;

//========================= Interface 1 =========================
interface In1 {

 // Abstract method
 // Must be implemented by any class that implements this interface.
 void method1();

 // Abstract method
 // This method is common between In1 and In2.
 // The implementing class only needs ONE implementation.
 void method2();

 // Default method
 // Interfaces can have concrete methods using the 'default' keyword (Java 8+).
 // Implementing classes inherit this method unless they override it.
 default void method() {
     System.out.println("In1 Default method");
 }
}


//========================= Interface 2 =========================
interface In2 {

 // Common abstract method.
 // Same signature as method2() in In1.
 // The implementing class provides only one implementation.
 void method2();

 // Another abstract method.
 void method3();

 // Default method with the SAME signature as In1.
 // This creates a conflict when another interface extends both In1 and In2.
 default void method() {
     System.out.println("In2 Default method");
 }
}


//========================= Child Interface =========================
interface In3 extends In1, In2 {

 /*
  * In3 extends both In1 and In2.
  *
  * Since both parent interfaces contain the same default method(),
  * Java cannot decide which implementation to inherit.
  *
  * This is called the "Default Method Conflict"
  * (also known as the Diamond Problem for interfaces).
  *
  * Therefore, In3 MUST override method() to resolve the conflict.
  */
 @Override
 default void method() {

     // Calls the default method of In1 explicitly.
     In1.super.method();

     // Calls the default method of In2 explicitly.
     In2.super.method();
 }
}


//========================= Implementation Class =========================
class Impl implements In3 {

 /*
  * Impl implements In3.
  *
  * Since In3 extends In1 and In2,
  * Impl indirectly implements ALL abstract methods
  * declared in both interfaces.
  */

 @Override
 public void method1() {
     System.out.println("method 1");
 }

 /*
  * Even though method2() exists in BOTH In1 and In2,
  * only ONE implementation is required because
  * both methods have the same signature.
  */
 @Override
 public void method2() {
     System.out.println("method 2");
 }

 @Override
 public void method3() {
     System.out.println("method 3");
 }

 /*
  * Notice:
  * We did NOT override method().
  *
  * Why?
  *
  * Because In3 has already resolved the default method conflict
  * and provides its own implementation.
  *
  * Therefore Impl automatically inherits In3's default method.
  */
}



//========================= Driver Class =========================
public class MulInheritanceEx2 {

 public static void main(String[] args) {

     /*
      * Parent Interface Reference
      * Child Class Object
      *
      * This demonstrates Runtime Polymorphism.
      */
     In3 m = new Impl();

     // Calls Impl.method1()
     m.method1();

     // Calls Impl.method2()
     // There is only one implementation even though
     // method2() exists in both parent interfaces.
     m.method2();

     // Calls Impl.method3()
     m.method3();

     /*
      * Calls method().
      *
      * Java searches in the following order:
      *
      * 1. Impl class
      * 2. In3 interface
      * 3. Parent interfaces (In1 & In2)
      *
      * Since Impl doesn't override method(),
      * Java finds the implementation inside In3.
      *
      * In3 then explicitly calls:
      *      In1.super.method();
      *      In2.super.method();
      */
     m.method();
 }
}