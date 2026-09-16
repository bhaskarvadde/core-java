package com.oops.interfaces;

//Monkey is implementing Animal interface.
//Therefore it MUST implement all abstract methods.

public class Monkey implements Animal {

 // Abstract method implementation
 @Override
 public void sound() {
     System.out.println("Ooh ooh, ah ah, ooh ooh, ah ah!");
 }

 @Override
 public void drink() {
     System.out.println("Monkey drinks almost everything.");
 }

 @Override
 public void eat() {
     System.out.println("Monkey likes bananas.");
 }

 /*
  * walk() is a default method in interface.
  *
  * Default methods are OPTIONAL to override.
  *
  * If Monkey has special walking behavior,
  * we override it.
  */

 @Override
 public void walk() {
     System.out.println("Monkey can walk and also jump.");
 }

 /*
  * run() is NOT overridden.
  *
  * Therefore Monkey automatically uses
  * the default implementation from Animal interface.
  */
}
