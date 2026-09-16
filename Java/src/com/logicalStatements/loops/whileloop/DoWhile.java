package com.logicalStatements.loops.whileloop;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yo;

        do {

            System.out.print("Enter n1: ");
            int n1 = sc.nextInt();

            System.out.print("Enter n2: ");
            int n2 = sc.nextInt();

            System.out.print("Enter Operator: ");
            String ch = sc.next();

            switch (ch) {

            case "+" -> System.out.println("Addition: " + (n1 + n2));

            case "-" -> System.out.println("Subtraction: " + (n1 - n2));

            case "*" -> System.out.println("Multiplication: " + (n1 * n2));

            case "/" -> System.out.println("Division: " + (n1 / n2));

            case "%" -> System.out.println("Modulus: " + (n1 % n2));

            default -> System.out.println("Invalid Operator");
            }

            System.out.print("Do you want to continue (yes/no)? ");
            yo = sc.next();

        } while (yo.equalsIgnoreCase("yes"));

        sc.close();
    }
}
