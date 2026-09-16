package com.oops.methodoverriding;

/*
 * METHOD OVERRIDING - ALL RULES IN ONE PROGRAM
 *
 * Rule 1: Same method name.
 * Rule 2: Same parameter list.
 * Rule 3: Same return type (primitive).
 * Rule 4: Covariant return type allowed (non-primitive).
 * Rule 5: Child cannot reduce access modifier.
 * Rule 6: Child can increase access modifier.
 * Rule 7: Static methods are hidden, not overridden.
 * Rule 8: Private methods are not overridden.
 * Rule 9: Final methods cannot be overridden.
 * Rule 10: Constructors cannot be overridden.
 * Rule 11: @Override checks whether overriding is correct.
 * Rule 12: Runtime polymorphism.
 */

class Animal {

    // Rule 1 & 2
    void sound() {
        System.out.println("Animal makes sound");
    }

    // Rule 3 (Primitive Return Type)
    int age() {
        return 5;
    }

    // Rule 4 (Covariant Return Type)
    Animal getObject() {
        return new Animal();
    }

    // Rule 6 (protected -> public is allowed)
    protected void eat() {
        System.out.println("Animal is eating");
    }

    // Rule 7 (Static Method)
    static void staticMethod() {
        System.out.println("Animal Static Method");
    }

    // Rule 8 (Private Method)
    private void privateMethod() {
        System.out.println("Animal Private Method");
    }

    public void callPrivate() {
        privateMethod();
    }

    // Rule 9 (Final Method)
    final void finalMethod() {
        System.out.println("Final Method");
    }

    // Constructor (Rule 10)
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    // Rule 1 & 2
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }

    // Rule 3
    @Override
    int age() {
        return 10;
    }

    // Rule 4 (Covariant Return Type)
    @Override
    Dog getObject() {
        return new Dog();
    }

    // Rule 6 (Increasing visibility)
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Rule 7 (Method Hiding)
    static void staticMethod() {
        System.out.println("Dog Static Method");
    }

    // Rule 8 (New Method)
    void privateMethod() {
        System.out.println("Dog Private Method");
    }

    // Rule 9 (Cannot Override Final Method)
    // finalMethod();   // Not Allowed

    Dog() {
        System.out.println("Dog Constructor");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        System.out.println("------ Parent Object ------");

        Animal a = new Animal();

        a.sound();
        System.out.println(a.age());
        a.eat();
        a.callPrivate();
        Animal.staticMethod();

        System.out.println();

        System.out.println("------ Child Object ------");

        Dog d = new Dog();

        d.sound();
        System.out.println(d.age());
        d.eat();
        d.privateMethod();
        Dog.staticMethod();

        System.out.println();

        System.out.println("------ Runtime Polymorphism ------");

        Animal obj = new Dog();

        obj.sound();          // Dog
        System.out.println(obj.age()); // Dog
        obj.eat();            // Dog
        obj.callPrivate();    // Animal
        Animal.staticMethod(); // Animal
    }
}

