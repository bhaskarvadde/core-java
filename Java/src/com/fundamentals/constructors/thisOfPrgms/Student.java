package com.fundamentals.constructors.thisOfPrgms;

public class Student {
    String name;
    int age;
    String course; 
 
    // Constructor 1 - all fields
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Main constructor called");
    }

    // Constructor 2 - calls Constructor 1 with default course
    Student(String name, int age) {
        this(name, age, "MCA");  // chains to Constructor 1
        System.out.println("Two-arg constructor called");
    }

    // Constructor 3 - calls Constructor 2 with default age
    Student(String name) {
        this(name, 21);  // chains to Constructor 2
        System.out.println("One-arg constructor called");
    }
    
    public static void main(String[] args) {
        Student s = new Student("Bhaskar");
        s.display();
    }

    void display() {
        System.out.println(name + " | " + age + " | " + course);
    }
}

   
