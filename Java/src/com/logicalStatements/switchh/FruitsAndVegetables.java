package com.logicalStatements.switchh;
import java.util.Scanner;

public class FruitsAndVegetables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBill = 0;
        char choice;

        System.out.println("      B-Mart");
        System.out.println("---------------");

        do {

            System.out.println("Enter category: ");
            String category = sc.nextLine(); 

            switch (category) {

                case "fruits" -> {
                    System.out.println("Enter an item:");
                    String item = sc.nextLine().toLowerCase();

                    switch (item) {
                        case "apple" -> {
                            System.out.println("Apple price is Rs20");
                            totalBill += 20;
                        }
                        case "banana" -> {
                            System.out.println("Banana price is Rs30 per 12 pcs");
                            totalBill += 30;
                        }
                        case "grapes" -> {
                            System.out.println("Grapes price is Rs40");
                            totalBill += 40;
                        }
                        case "orange" -> {
                            System.out.println("Orange price is Rs15");
                            totalBill += 15;
                        }
                        case "papaya" -> {
                            System.out.println("Papaya price is Rs20");
                            totalBill += 20;
                        }
                        default -> System.out.println("Item not available");
                    }
                }

                case "vegetables" -> {
                    System.out.println("Enter an item:");
                    String item = sc.nextLine().toLowerCase();

                    switch (item) {
                        case "tomato" -> {
                            System.out.println("Tomato price is Rs25");
                            totalBill += 25;
                        }
                        case "brinjal" -> {
                            System.out.println("Brinjal price is Rs50");
                            totalBill += 50;
                        }
                        case "potato" -> {
                            System.out.println("Potato price is Rs110");
                            totalBill += 110;
                        }
                        case "bottleguard" -> {
                            System.out.println("Bottleguard price is Rs75");
                            totalBill += 75;
                        }
                        case "cucumber" -> {
                            System.out.println("Cucumber price is Rs80");
                            totalBill += 80;
                        }
                        default -> System.out.println("Item not available");
                    }
                }

                default -> System.out.println("Invalid category");
            }

            System.out.println("Do you want to buy more items? (Y/N)");
            choice = sc.next().charAt(0);
            sc.nextLine(); // newline

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nTotal Bill = Rs" + totalBill);

        sc.close();
    }
}