package com.oops.interfaces;

public class TestAnimal {

    public static void main(String[] args) {

        System.out.println("******** Cat Info ********");

        /*
         * Upcasting
         *
         * Parent Reference = Child Object
         *
         * Animal is interface (Parent)
         * Cat is implementing class (Child)
         *
         * This is one of the ways abstraction is achieved.
         */

        Animal c = new Cat();

        // Calls Cat's overridden methods
        c.sound();
        c.drink();
        c.eat();

        // Calls Cat's walk() if overridden
        // Otherwise interface default walk()
        c.walk();

        // Calls default run()
        c.run();

        /*
         * Accessing interface constant.
         *
         * Variables in interfaces are:
         * public static final
         */

        System.out.println(Animal.orgName);

        // ===========================================

        System.out.println("\n******** Dog Info ********");

        Animal d = new Dog();

        d.sound();
        d.eat();
        d.drink();
        d.walk();
        d.run();

        /*
         * Interface static methods
         * are accessed ONLY using interface name.
         *
         * Correct:
         * Animal.breath();
         *
         * Wrong:
         * d.breath();
         */

        Animal.breath();

        // ===========================================

        System.out.println("\n******** Monkey Info ********");

        Animal m = new Monkey();

        m.sound();
        m.eat();
        m.drink();

        /*
         * Monkey overrides walk(),
         * so Monkey's version executes.
         */

        m.walk();

        /*
         * Monkey does not override run(),
         * so interface default run() executes.
         */

        m.run();
    }
}
