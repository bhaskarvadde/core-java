package com.oops.interfaces;

// Cat also signs the same contract.
// It must implement all methods.

public class Cat implements Animal {

    @Override
    public void sound() {

        // Cat provides its own implementation.

        System.out.println("Cat sounds Meow meow");
    }

    @Override
    public void drink() {

        // Cat implementation

        System.out.println("Cat drinks milk");
    }

    @Override
    public void eat() {

        // Cat implementation

        System.out.println("Cat eats rat");
    }
}