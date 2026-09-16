package com.oops.shallowAndDeepCopy;

//==============================================================
//SHALLOW COPY DEMO
//==============================================================
//GOAL: Understand that Object.clone() copies primitive/String
//fields by VALUE, but copies object-reference fields (like
//Address) by REFERENCE — meaning original and clone end up
//pointing to the SAME nested object.
//==============================================================

class Student implements Cloneable {
 // implements Cloneable -> this is a "marker interface".
 // It has no methods, but it TELLS the JVM: "this class is
 // allowed to be cloned using Object.clone()".
 // Without this, calling clone() throws CloneNotSupportedException.

 int id;             // primitive field -> stored directly inside the Student object
 String name;        // String is immutable -> behaves safely even in shallow copy
 Address address;     // REFERENCE field -> this is where shallow copy danger lives

 @Override
 protected Object clone() throws CloneNotSupportedException {
     // super.clone() calls Object's native clone() method.
     // It does a FIELD-BY-FIELD, BIT-BY-BIT copy:
     //   - id (int)      -> value copied            => independent copy
     //   - name (String) -> reference copied, but String is immutable => safe
     //   - address       -> reference copied AS-IS   => SHARED with original!
     return super.clone();
 }

 public Student(int id, String name, Address address) {
     this.id = id;
     this.name = name;
     this.address = address;
 }
}

class Address {
 String city;

 public Address(String city) {
     this.city = city;
 }
}

//Driver class
public class ShallowCopy {

 public static void main(String[] args) throws CloneNotSupportedException {
     System.out.println("main method started !");

     // Step 1: Create one Address object -> stored once in heap memory
     Address add = new Address("Hyderabad");

     // Step 2: Create s1 -> s1.address points to the 'add' object above
     Student s1 = new Student(101, "Sekhar", add);

     System.out.println("Student ID : " + s1.id);              // 101
     System.out.println("Student Name : " + s1.name);          // Sekhar
     System.out.println("Student Address :" + s1.address.city); // Hyderabad
     System.out.println("*******************************************");

     // Step 3: Clone s1 -> creates a NEW Student object (s2),
     // but s2.address is copied BY REFERENCE -> s2.address and
     // s1.address now point to the EXACT SAME Address object.
     Student s2 = (Student) s1.clone();

     System.out.println("Student ID : " + s2.id);               // 101
     System.out.println("Student Name : " + s2.name);           // Sekhar
     System.out.println("Student Address :" + s2.address.city); // Hyderabad
     System.out.println("*******************************************");

     // Step 4: Mutate s2's fields
     s2.name = "Srikanth";
     // This does NOT affect s1.name, because String reassignment
     // just makes s2.name point to a brand-new String object.
     // The old String ("Sekhar") that s1.name points to is untouched.

     s2.address.city = "Banglore";
     // THIS is the shallow copy trap!
     // s2.address is the SAME object as s1.address (from Step 3).
     // So changing s2.address.city actually mutates the ONE shared
     // Address object -> s1.address.city changes too, even though
     // we never touched s1 directly.

     System.out.println("Student ID : " + s2.id);               // 101
     System.out.println("Student Name : " + s2.name);           // Srikanth
     System.out.println("Student Address :" + s2.address.city); // Banglore
     System.out.println("*******************************************");

     // Step 5: Check s1 again -> proof of shallow copy
     System.out.println("Student ID : " + s1.id);               // 101 (unaffected - primitive)
     System.out.println("Student Name : " + s1.name);           // Sekhar (unaffected - String is immutable)
     System.out.println("Student Address :" + s1.address.city); // Banglore !! (affected - shared reference)
     System.out.println("*******************************************");

     // TAKEAWAY:
     // s1.id and s1.name stayed safe because they are primitive/immutable.
     // s1.address.city changed unexpectedly because Address is a mutable
     // object and its reference was shared, not duplicated.
 }
}
