package com.oops.interfaces;

//Interface = A contract
//Any class that implements this interface MUST provide
//implementations for all abstract methods.

public interface Animal {

 // Interface variables are automatically:
 // public static final
 // They act as constants.
 public static final String orgName = "Vcube";

 // ---------------- ABSTRACT METHODS ----------------
 // No implementation.
 // Every implementing class MUST define these methods.

 public abstract void sound();
 public abstract void drink();
 public abstract void eat();

 // =====================================================
 // DEFAULT METHODS (Introduced in Java 8)
 // =====================================================

 /*
  * Why were default methods introduced?
  *
  * Imagine:
  * Interface Animal is implemented by 100 classes.
  *
  * Suddenly the client says:
  * "Add a walk() method."
  *
  * Before Java 8:
  * Every one of those 100 classes had to implement walk().
  *
  * This breaks existing code.
  *
  * This problem is called:
  * Backward Compatibility Problem.
  *
  * Java solved this by introducing default methods.
  *
  * A default method already has implementation.
  * Existing classes continue working.
  *
  * If needed, a class may override it.
  */

 public default void walk() {
     System.out.println("By default every animal can walk!");
     hello();      // Calling private method
 }

 public default void run() {
     System.out.println("By default every animal can run!");
     hello();      // Reusing same code
 }

 // =====================================================
 // STATIC METHODS (Introduced in Java 8)
 // =====================================================

 /*
  * Why static methods?
  *
  * Some behavior is common for ALL animals.
  *
  * Example:
  * Every animal breathes.
  *
  * Instead of writing this method in every class,
  * we write it once in the interface.
  *
  * Interface static methods:
  * - cannot be overridden
  * - are called only using interface name
  *
  * Correct:
  * Animal.breath();
  *
  * Wrong:
  * obj.breath();
  */

 public static void breath() {
     System.out.println("Every animal should breathe to survive.");
 }

 // Interface can even have a main() method.
 public static void main(String[] args) {
     System.out.println("Main method started");
     breath();
 }

 // =====================================================
 // PRIVATE METHODS (Introduced in Java 9)
 // =====================================================

 /*
  * Why private methods?
  *
  * Suppose multiple default methods contain
  * the same repeated code.
  *
  * Instead of copying it,
  * create one private helper method.
  *
  * It can only be used inside this interface.
  *
  * It CANNOT be:
  * - overridden
  * - accessed by implementing classes
  */

 private void hello() {
     System.out.println("Hello");
     System.out.println("Hello");
     System.out.println("Hello");
     System.out.println("Hello");
     System.out.println("Hello");
     System.out.println("Hello");
 }
}

//Interface
//
//Animal
//-----------------------------
//sound();      ← Declaration
//drink();      ← Declaration
//eat();        ← Declaration
//-----------------------------
//▲
//│ implements
//-------------------------
//│                       │
//│                       │
//Dog                     Cat
//│                       │
//sound(){Bow Bow}      sound(){Meow}
//drink(){Water}        drink(){Milk}
//eat(){Pedigree}       eat(){Rat}
//│                       │
//└─────────────┬─────────┘
//│
//Driver Class
//
//Animal d = new Dog();
//
//d.sound();
//
//↓
//
//Java calls Dog's implementation
//
//↓
//
//Dog sounds Bow bow
