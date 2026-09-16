package com.oops.methodoverloading;

/*
 * Method Overloading
 * ------------------
 * Method Overloading is the process of defining multiple methods
 * with the same name in the same class but with different parameters.
 *
 * A method can be overloaded by changing:
 * 1. Number of parameters
 * 2. Type of parameters
 * 3. Order of parameters (when types are different)
 *
 * Method Overloading is also called:
 * -> Compile-Time Polymorphism
 * -> Static Polymorphism
 */

public class MethodOverLoading {

    // 1. No Parameters
    void display() {
        System.out.println("No Parameters");
    }

    // 2. Primitive Data Type
    void display(int num) {
        System.out.println("Primitive int : " + num);
    }

    // 3. Another Primitive Data Type
    void display(double num) {
        System.out.println("Primitive double : " + num);
    }

    // 4. Multiple Primitive Parameters
    void display(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 5. Different Order of Parameters
    void display(int age, String name) {
        System.out.println("Age : " + age + ", Name : " + name);
    }

    // 6. Different Order (Same Types)
    void display(String name, int age) {
        System.out.println("Name : " + name + ", Age : " + age);
    }

    // 7. Non-Primitive Data Type (String)
    void display(String message) {
        System.out.println("Message : " + message);
    }

    // 8. Non-Primitive Data Type (Array)
    void display(int[] arr) {
        System.out.print("Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 9. Non-Primitive Data Type (2D Array)
    void display(int[][] matrix) {
        System.out.println("2D Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 10. Non-Primitive Data Type (Object)
    void display(Student s) {
        System.out.println("Student Name : " + s.name);
    }

    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();

        obj.display();

        obj.display(10);

        obj.display(25.5);

        obj.display(10, 20);

        obj.display(22, "Bhaskar");

        obj.display("Bhaskar", 22);

        obj.display("Welcome to Java");

        int[] arr = {10, 20, 30, 40};
        obj.display(arr);

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        obj.display(matrix);

        Student s = new Student("Bhaskar");
        obj.display(s);
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}