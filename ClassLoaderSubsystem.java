package com.javaintroduction;

public class ClassLoaderSubsystem {

    public static void main(String[] args) throws ClassNotFoundException {
        
        // Print a message to indicate that the program has started execution
        System.out.println("Main method started");
        
        // Dynamically load the class 'HelloWorld' from the package 'com.javaintroduction'
        // - Class.forName() loads the class into memory at runtime
        // - If the class has a static block, it will be executed immediately
        // - This is often used to trigger static initialization logic without creating an object
        Class.forName("com.javaintroduction.HelloWorld");
        
        // If the above line executes successfully, print confirmation
        System.out.println("Class Loaded Successfully");
        
        // Load the MySQL JDBC driver class
        // - This ensures that the driver registers itself with DriverManager
        // - Required for establishing database connections in older JDBC versions
        // - In newer versions, drivers are auto-discovered, but this is still common practice
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Print a message to indicate that the program has finished execution
        System.out.println("Main method ended");
    }
}
